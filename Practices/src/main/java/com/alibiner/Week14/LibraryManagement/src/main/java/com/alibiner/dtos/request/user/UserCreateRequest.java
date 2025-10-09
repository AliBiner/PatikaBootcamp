package com.alibiner.dtos.request.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreateRequest {

    @NotNull(message = "Can not be null name of user")
    @NotBlank(message = "Can not be blank name of user")
    private String name;

    @NotNull(message = "Can not be null email")
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Can not be null password")
    @NotBlank(message = "Can not be blank password")

    private String password;

    @NotNull(message = "Can not be null birth date")
    private LocalDate birthDate;

    @Override
    public String toString() {
        return "UserCreateRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
