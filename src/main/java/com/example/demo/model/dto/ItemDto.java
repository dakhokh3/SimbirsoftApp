package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ItemDto {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer count;
    private Integer categoryId;
}
