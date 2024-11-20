package com.example.demo.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Integer id;
    private String imagePath;
    private String title;
    private String description;

    // Constructor vacío
    public ProductDTO() {
    }

    // Constructor con todos los atributos
    public ProductDTO(Integer id, String imagePath, String title, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
}
