package com.alibiner.result;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    private boolean success;
    private String message;
    private T data;

    public static Result<Void> ok(){
        return new Result<>(true,"Success",null);
    }

    public static Result<Void> ok(String message){
        return new Result<>(true,message,null);
    }

    public static <T> Result<T> ok(T data){
        return new Result<>(true,"Success",data);
    }

    public static <T> Result<T> validation(T errorMessage){
        return new Result<>(false,"Validation Error", errorMessage);
    }

    public static Result<Void> fail(String message){
        return new Result<>(false,message,null);
    }

    public static Result<Void> unauthorized(String message){
        return new Result<>(false,message,null);
    }

    public static <T> Result<T> login(T token){
        return new Result<>(true,"Success",token);
    }
}
