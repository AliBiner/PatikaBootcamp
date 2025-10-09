package com.alibiner.services;

import java.util.*;
import com.alibiner.core.config.globalExceptionHandler.exceptions.PropertyNotDefinedException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.UserNotFoundException;
import com.alibiner.entities.RefreshToken;
import com.alibiner.entities.User;
import com.alibiner.interfaces.services.IRefreshTokenService;
import com.alibiner.repositories.RefreshTokenRepository;
import com.alibiner.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class RefreshTokenService implements IRefreshTokenService {

    @Value("${security.jwt.refresh-expiration-time}")
    private Long refreshTokenDurationMs;

    private final RefreshTokenRepository refreshTokenRepository;
    private final UserRepository userRepository;

    public RefreshTokenService(RefreshTokenRepository refreshTokenRepository, UserRepository userRepository) {
        this.refreshTokenRepository = refreshTokenRepository;
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init(){
        if (refreshTokenDurationMs == null)
            throw new PropertyNotDefinedException("security.jwt.refresh-expiration-time is null");
        if (refreshTokenDurationMs <= 0)
            throw new PropertyNotDefinedException("security.jwt.refresh-expiration-time can not zero or negative");
    }

    @Override
    public RefreshToken createRefreshToken(Long userId) {
        var token = new RefreshToken();
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        token.setUser(user);
        token.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
        token.setToken(UUID.randomUUID().toString());
        refreshTokenRepository.save(token);
        return token;
    }

    @Override
    public RefreshToken createRefreshToken(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(UserNotFoundException::new);

        Optional<RefreshToken> refreshToken = refreshTokenRepository.findByUser(user);

        if (refreshToken.isPresent()){
            if (!isTokenExpired(refreshToken.get())) {
                return refreshToken.get();
            }
            else{
                refreshTokenRepository.delete(refreshToken.get());
            }
        }


        RefreshToken newRefreshToken = new RefreshToken();

        newRefreshToken.setUser(user);
        newRefreshToken.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
        newRefreshToken.setToken(UUID.randomUUID().toString());
        refreshTokenRepository.save(newRefreshToken);
        return newRefreshToken;
    }


    @Override
    public boolean isTokenExpired(RefreshToken token) {
        return token.getExpiryDate().isBefore(Instant.now());
    }
}
