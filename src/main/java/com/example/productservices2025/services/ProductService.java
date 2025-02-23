package com.example.productservices2025.services;

import com.example.productservices2025.model.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();

}
