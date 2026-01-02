package com.sai.ordersystem.user_service.service;

import com.sai.ordersystem.user_service.dto.RegisterRequestDTO;
import com.sai.ordersystem.user_service.model.User;
import com.sai.ordersystem.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public User register(RegisterRequestDTO registerRequestDTO){
        User user= User.builder()
                .email(registerRequestDTO.getEmail())
                .password(passwordEncoder.encode(registerRequestDTO.getPassword()))
                .role("USER")
                .build();
        return userRepository.save(user);
    }
}
