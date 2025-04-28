package com.HuynhDuyKhanh.example05.service;

import com.HuynhDuyKhanh.example05.entity.Category;
import com.HuynhDuyKhanh.example05.payloads.CategoryDTO;
import com.HuynhDuyKhanh.example05.payloads.CategoryResponse;

public interface CategoryService {
    
    CategoryDTO createCategory(Category category);
    CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO updateCategory(Category category, Long categoryId);
    String deleteCategory(Long categoryId);
    CategoryDTO getCategoryById(Long categoryId);
}
