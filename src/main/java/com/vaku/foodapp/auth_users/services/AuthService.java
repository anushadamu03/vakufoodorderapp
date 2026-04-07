package com.vaku.foodapp.auth_users.services;

import com.vaku.foodapp.auth_users.dtos.LoginRequest;
import com.vaku.foodapp.auth_users.dtos.LoginResponse;
import com.vaku.foodapp.auth_users.dtos.RegistrationRequest;
import com.vaku.foodapp.response.Response;

public interface AuthService {
    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);
}
