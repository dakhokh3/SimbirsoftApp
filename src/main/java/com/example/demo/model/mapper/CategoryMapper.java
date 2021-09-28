package com.example.demo.model.mapper;

import com.example.demo.model.dto.CategoryDto;
import com.example.demo.model.entity.Category;

public class CategoryMapper {
    public static CategoryDto map(Category entity) {
        CategoryDto dto = new CategoryDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static Category map(CategoryDto dto) {
        Category entity = new Category();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
