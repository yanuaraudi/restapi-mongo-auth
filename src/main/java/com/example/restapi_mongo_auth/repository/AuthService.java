package com.example.restapi_mongo_auth.repository;

import com.example.restapi_mongo_auth.dto.AuthResponse;
import com.example.restapi_mongo_auth.dto.LoginRequest;
import com.example.restapi_mongo_auth.dto.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
