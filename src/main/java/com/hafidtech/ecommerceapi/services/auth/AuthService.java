package com.hafidtech.ecommerceapi.services.auth;

import com.hafidtech.ecommerceapi.dto.ProductDto;
import com.hafidtech.ecommerceapi.dto.SignupRequest;
import com.hafidtech.ecommerceapi.dto.UserDto;

import java.util.List;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

}
