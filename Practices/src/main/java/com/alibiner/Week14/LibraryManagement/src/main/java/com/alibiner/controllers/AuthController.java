package com.alibiner.controllers;

import java.util.*;
import com.alibiner.dtos.request.auth.RefreshTokenRequest;
import com.alibiner.dtos.response.user.UserLoginResponseDto;
import com.alibiner.dtos.response.user.UserResponseDto;
import com.alibiner.entities.RefreshToken;
import com.alibiner.entities.User;
import com.alibiner.repositories.RefreshTokenRepository;
import com.alibiner.result.Result;
import com.alibiner.core.config.security.token.JwtService;
import com.alibiner.services.RefreshTokenService;
import com.alibiner.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final RefreshTokenRepository refreshTokenRepository;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    public AuthController(AuthenticationManager authenticationManager, JwtService jwtService, RefreshTokenRepository refreshTokenRepository, RefreshTokenService refreshTokenService, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.refreshTokenRepository = refreshTokenRepository;
        this.refreshTokenService = refreshTokenService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<Result<UserLoginResponseDto>> login(@RequestBody LoginRequest loginRequest) {
        Authentication authenticationRequest =
                UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.email(), loginRequest.password());
        Authentication authenticationResponse =
                this.authenticationManager.authenticate(authenticationRequest);

        String jwt = null;
        if (authenticationResponse.getPrincipal() instanceof UserDetails userDetails){
            jwt  = jwtService.generateToken(userDetails);
        }

        RefreshToken refreshToken = refreshTokenService.createRefreshToken(loginRequest.email());

        UserLoginResponseDto result = new UserLoginResponseDto(jwt,refreshToken.getToken());

        return ResponseEntity.ok(Result.login(result));
    }

    public record LoginRequest(String email, String password) {
    }

    @PostMapping("/refresh")
    public ResponseEntity<Result<?>> refreshToken(@RequestBody RefreshTokenRequest request){
        System.out.println("geldi");
        String requestToken = request.getRefreshToken();

        Optional<RefreshToken> refreshToken = refreshTokenRepository.findByToken(requestToken);
        if (refreshToken.isEmpty())
            return ResponseEntity.badRequest().body(Result.fail("Invalid refresh token."));

        if (refreshTokenService.isTokenExpired(refreshToken.get())){
            refreshTokenRepository.delete(refreshToken.get());
            return ResponseEntity.badRequest().body(Result.fail("Refresh token expired. Please login again."));
        }

        String newJwt = jwtService.generateToken(refreshToken.get().getUser());
        return ResponseEntity.ok(Result.ok(Map.of("token",newJwt)));
    }
}
