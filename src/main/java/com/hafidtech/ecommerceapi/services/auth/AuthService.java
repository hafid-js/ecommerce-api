package com.hafidtech.ecommerceapi.services.auth;

import com.hafidtech.ecommerceapi.dto.SignupRequest;
import com.hafidtech.ecommerceapi.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
}
