package com.hafidtech.ecommerceapi.services.admin.adminproduct;

import com.hafidtech.ecommerceapi.dto.ProductDto;
import com.hafidtech.ecommerceapi.entity.Product;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {

    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductByName(String name);

    boolean deleteProduct(Long id);
}
