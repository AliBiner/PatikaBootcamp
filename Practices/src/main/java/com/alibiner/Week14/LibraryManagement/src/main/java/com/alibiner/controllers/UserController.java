package com.alibiner.controllers;

import com.alibiner.dtos.request.user.UserCreateRequest;
import com.alibiner.dtos.request.user.UserLoginRequest;
import com.alibiner.dtos.response.user.UserResponseDto;
import com.alibiner.interfaces.services.IUserService;
import com.alibiner.result.Result;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }


    @PostMapping("/")
    public ResponseEntity<Result<UserResponseDto>> create(@Valid @RequestBody UserCreateRequest request){
        System.out.println(request);
        UserResponseDto userResponseDto = userService.create(request);
        return ResponseEntity.ok().body(Result.ok(userResponseDto));
    }


    @GetMapping("/getById")
    public ResponseEntity<String> getById(@RequestParam(name = "id") long id){
        UserResponseDto byId = userService.getById(id);
        return ResponseEntity.ok(byId.getName());
    }
}
