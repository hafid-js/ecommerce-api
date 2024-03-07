package com.hafidtech.ecommerceapi.services.customer;

import com.hafidtech.ecommerceapi.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();
}
