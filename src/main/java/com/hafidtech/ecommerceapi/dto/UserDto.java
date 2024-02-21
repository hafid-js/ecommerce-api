package com.hafidtech.ecommerceapi.dto;

import com.hafidtech.ecommerceapi.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;
}
