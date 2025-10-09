package com.alibiner.services;

import java.util.*;
import com.alibiner.core.config.globalExceptionHandler.exceptions.AlreadyExistException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.PasswordMismatchException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.UserNotFoundException;
import com.alibiner.core.config.modelMapper.IModelMapperService;
import com.alibiner.dtos.request.user.UserCreateRequest;
import com.alibiner.dtos.response.user.UserResponseDto;
import com.alibiner.entities.User;
import com.alibiner.interfaces.services.IUserService;
import com.alibiner.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final IModelMapperService modelMapper;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepository, IModelMapperService modelMapper, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.encoder = encoder;
    }

    @Override
    public UserResponseDto create(UserCreateRequest dto) {
        Optional<User> isAlready = userRepository.findByEmail(dto.getEmail());
        if (isAlready.isPresent())
            throw new AlreadyExistException("User Already Exist");

        User user = modelMapper.forRequest().map(dto,User.class);

        String hashPass = encoder.encode(user.getPassword());
        user.setPassword(hashPass);

        user = userRepository.save(user);
        return modelMapper.forResponse().map(user,UserResponseDto.class);
    }

    @Override
    public UserResponseDto login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        user.orElseThrow(()-> new UserNotFoundException(email));

        if (!encoder.matches(user.get().getPassword(), password))
            throw new PasswordMismatchException();

        UserResponseDto mappedUser = modelMapper.forResponse().map(user, UserResponseDto.class);
        return mappedUser;
    }

    @Override
    public UserResponseDto getById(long id) {
        Optional<User> user = userRepository.findById(id);

        user.orElseThrow(UserNotFoundException::new);

        return modelMapper.forResponse().map(user,UserResponseDto.class);
    }
    //Todo - Null Pointer hatasını handle et
}
