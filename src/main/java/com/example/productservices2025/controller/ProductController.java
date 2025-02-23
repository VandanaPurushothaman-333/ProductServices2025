package com.example.productservices2025.controller;

//Here we can add all the APIs related to Products like--> Create, Update, Delete etc

import com.example.productservices2025.model.Product;
import com.example.productservices2025.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")

//We need to get the product object while calling this API, So, return type is "product"
public class ProductController {

    // Spring Framework will try to create an object of Controller. Then it will realize that, it would need an object
    // of service to create an object of controller as it is dependent.
    // But Can we create an object of interface? No. (it's no a class,right?)
    // Spring Framework will try to find the object of its implementation
    // if @Service is not given at Fakestore PS Spring will not understand whether it is a special class or not.
    // So will throw error if annotation is not given

    private ProductService productService;  //--> we can't initialize Interface as it is incomplete .
    //Instead of using FakestoreProductService, we are calling interface
    // So we need to inject this using Dependency Injection.


    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    //here, id is the input parameter or path variable
    //To call this API -->  http://localhost:8081/products/10
    //To pass the id variable , we need to use annotation @Path variable
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
}
