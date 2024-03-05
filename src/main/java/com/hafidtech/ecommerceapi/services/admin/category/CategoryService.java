package com.hafidtech.ecommerceapi.services.admin.category;
import com.hafidtech.ecommerceapi.dto.CategoryDto;
import com.hafidtech.ecommerceapi.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
