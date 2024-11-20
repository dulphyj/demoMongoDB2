package com.example.demo.domain.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "product")
public class Product  implements Serializable {
    @Id
    @NonNull
    private Integer id;
    private String imagePath;
    private String title;
    private String description;

    public Product(@NonNull Integer id, String imagePath, String title, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
}
