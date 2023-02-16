package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.CategoryRepository;
import com.busayo.ecommerce.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
