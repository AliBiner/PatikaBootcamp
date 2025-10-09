package com.alibiner.core.config.globalExceptionHandler.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String email) {
        super("User not found: " + email);
    }

    public UserNotFoundException() {
    }
}
