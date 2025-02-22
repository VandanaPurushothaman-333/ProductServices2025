package com.example.productservices2025.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//All the attributes will get getter & setter.
// Instead of using multiple lines of code, we are using Lombok annotations
public class Product {
    private long id;
    private String title;
    private double price;
    private Category category;

}
