package com.sai.ordersystem.user_service.controller;

import com.sai.ordersystem.user_service.dto.RegisterRequestDTO;
import com.sai.ordersystem.user_service.model.User;
import com.sai.ordersystem.user_service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> register(@Valid @RequestBody RegisterRequestDTO registerRequestDTO){
        return ResponseEntity.ok(userService.register(registerRequestDTO));

    }
}
