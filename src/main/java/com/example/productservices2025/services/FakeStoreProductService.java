package com.example.productservices2025.services;

import com.example.productservices2025.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //we need to ask spring to create the object of this class, make it as special class
public class FakeStoreProductService implements ProductService {


    @Override
    public Product getSingleProduct(Long productId) {
        return new Product();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
