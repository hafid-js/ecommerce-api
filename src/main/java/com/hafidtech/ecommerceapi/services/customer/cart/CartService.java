package com.hafidtech.ecommerceapi.services.customer.cart;

import com.hafidtech.ecommerceapi.dto.AddProductInCartDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);
}
