package com.alibiner.core.config.globalExceptionHandler;

import java.util.*;
import com.alibiner.core.config.globalExceptionHandler.exceptions.AlreadyExistException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.PasswordMismatchException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.PropertyNotDefinedException;
import com.alibiner.core.config.globalExceptionHandler.exceptions.UserNotFoundException;
import com.alibiner.result.Result;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.View;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final View error;

    public GlobalExceptionHandler(View error) {
        this.error = error;
    }

    @ExceptionHandler(AlreadyExistException.class)
    public ResponseEntity<Result<Void>> handleAlreadyExistException(AlreadyExistException e){
        return new ResponseEntity<>(Result.fail(e.getMessage()),HttpStatus.CONFLICT);
    }

    @ExceptionHandler({UserNotFoundException.class, PasswordMismatchException.class,
            InternalAuthenticationServiceException.class, BadCredentialsException.class})
    public ResponseEntity<Result<Void>> handleAuthExceptions(RuntimeException e){
        //Todo - log eklenecek
        return new ResponseEntity<>(Result.unauthorized("Invalid email or password."),HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(PropertyNotDefinedException.class)
    public void handlePropertyNotDefinedException(PropertyNotDefinedException e){
        System.err.println(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Result<List<String>>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        List<String> errors = e.getFieldErrors().stream().map(
                DefaultMessageSourceResolvable::getDefaultMessage
        ).toList();

        return  ResponseEntity.badRequest().body(Result.validation(errors));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e){
        System.out.println("genel exception'a düştü");
        //Todo - log eklenecek
        e.printStackTrace();
        return ResponseEntity.internalServerError().body("Unexpected Exception");
    }
}
