package com.alibiner.core.config.globalExceptionHandler.exceptions;

public class PasswordMismatchException extends RuntimeException {
    public PasswordMismatchException() {
        super("Password mismatch");
    }
}
