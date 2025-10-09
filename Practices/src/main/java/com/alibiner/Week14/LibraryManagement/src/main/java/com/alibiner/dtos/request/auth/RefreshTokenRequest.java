package com.alibiner.dtos.request.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RefreshTokenRequest {
    @NotNull(message = "Refresh Token can not be null")
    @NotBlank(message = "Refresh Token can not be blank")
    private String refreshToken;
}
