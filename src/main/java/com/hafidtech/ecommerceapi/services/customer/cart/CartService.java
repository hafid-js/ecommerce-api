package com.hafidtech.ecommerceapi.services.customer.cart;

import com.hafidtech.ecommerceapi.dto.AddProductInCartDto;
import com.hafidtech.ecommerceapi.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCartByUserId(Long userId);
}
