package com.example.restapi_mongo_auth.service;

import com.example.restapi_mongo_auth.dto.AuthResponse;
import com.example.restapi_mongo_auth.dto.LoginRequest;
import com.example.restapi_mongo_auth.dto.RegisterRequest;
import com.example.restapi_mongo_auth.model.Role;
import com.example.restapi_mongo_auth.model.User;
import com.example.restapi_mongo_auth.repository.AuthService;
import com.example.restapi_mongo_auth.repository.UserRepository;
import com.example.restapi_mongo_auth.security.jwt.JwtUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;

    @Override
    public AuthResponse register(@Valid RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email is already registered.");
        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(Collections.singleton(Role.ROLE_USER))
                .build();

        userRepository.save(user);

        return new AuthResponse(null,"User registered successfully.");
    }

    @Override
    public AuthResponse login(@Valid LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtils.generateToken(user.getEmail());
        return new AuthResponse(token, "Login successful");
    }
}
