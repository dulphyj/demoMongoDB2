package com.example.demo.service;

import com.example.demo.domain.model.Product;
import com.example.demo.dto.ProductDTO;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;//ojo privado

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public void createProduct(ProductDTO productDTO){
        Product product = new Product(
                productDTO.getId(),
                productDTO.getImagePath(),
                productDTO.getTitle(),
                productDTO.getDescription()
        );
        repository.save(product);
    }

    public void updateProduct(Integer productId, ProductDTO productDTO){
        Product product = repository.findById(productId).orElse(null);
        if(product != null){
            product.setTitle(productDTO.getTitle());
            product.setDescription(productDTO.getDescription());
            repository.save(product);
        }
    }

    public void deleteProduct(Integer productId){
        Product product = repository.findById(productId).orElse(null);
        if(product != null)
            repository.delete(product);
    }
}
