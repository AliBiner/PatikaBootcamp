package com.alibiner.interfaces.services;

import com.alibiner.entities.RefreshToken;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.experimental.NonFinal;

public interface IRefreshTokenService {
    RefreshToken createRefreshToken(@NotNull Long userId);
    RefreshToken createRefreshToken(@NotNull String email);
    boolean isTokenExpired(@NotNull RefreshToken token);
}
