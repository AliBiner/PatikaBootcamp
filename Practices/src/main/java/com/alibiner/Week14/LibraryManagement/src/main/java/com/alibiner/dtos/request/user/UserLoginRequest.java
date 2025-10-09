package com.alibiner.dtos.request.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserLoginRequest {

    @NotNull(message = "Can not be null email")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email")
    private String email;

    @NotNull(message = "Can not be null password")
    @NotBlank(message = "Can not be blank password")
    private String password;
}
