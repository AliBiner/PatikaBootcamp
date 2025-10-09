package com.alibiner.interfaces.services;


import com.alibiner.dtos.request.user.UserCreateRequest;
import com.alibiner.dtos.response.user.UserResponseDto;

public interface IUserService {
    UserResponseDto create(UserCreateRequest dto);

    UserResponseDto login(String email, String password);

    UserResponseDto getById(long id);
}
