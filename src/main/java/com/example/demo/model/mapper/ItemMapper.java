package com.example.demo.model.mapper;

import com.example.demo.model.dto.ItemDto;
import com.example.demo.model.entity.Item;

public class ItemMapper {
    public static ItemDto map(Item entity) {
        ItemDto dto = new ItemDto();
        dto.setId(entity.getId());
        dto.setCount(entity.getCount());
        dto.setDescription(entity.getDescription());
        //dto.setCategoryId(entity.getCategoryid());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public static Item map(ItemDto dto) {
        Item entity = new Item();
        entity.setId(dto.getId());
        entity.setCount(dto.getCount());
        entity.setDescription(dto.getDescription());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        return entity;
    }
}

