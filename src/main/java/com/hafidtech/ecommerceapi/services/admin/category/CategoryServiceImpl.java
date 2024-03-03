package com.hafidtech.ecommerceapi.services.admin.category;

import com.hafidtech.ecommerceapi.dto.CategoryDto;
import com.hafidtech.ecommerceapi.entity.Category;
import com.hafidtech.ecommerceapi.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }
}
