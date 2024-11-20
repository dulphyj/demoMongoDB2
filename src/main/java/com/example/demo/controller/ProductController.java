package com.example.demo.controller;

import com.example.demo.domain.model.Product;
import com.example.demo.dto.ProductDTO;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products", produces = "application/json")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @PostMapping(value = "/product")
    public ResponseEntity saveProduct(@RequestBody ProductDTO productDTO){
        productService.createProduct(productDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(value = "/{productId}")
    public ResponseEntity updateProduct(@PathVariable Integer productId, @RequestBody ProductDTO productDTO){
        productService.updateProduct(productId, productDTO);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity deleteProduct(@PathVariable Integer productId){
        productService.deleteProduct(productId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
