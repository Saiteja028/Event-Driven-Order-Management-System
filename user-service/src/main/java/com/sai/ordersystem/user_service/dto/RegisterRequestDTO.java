package com.sai.ordersystem.user_service.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequestDTO {
    @Email
    @NotBlank
    private String email;

    @Size(min = 8)
    private String password;

}
