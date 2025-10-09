package com.alibiner.dtos.response.user;


import lombok.Data;

@Data
public class UserResponseDto {
    private long id;
    private String name;
    private String email;
    private String token;
}
