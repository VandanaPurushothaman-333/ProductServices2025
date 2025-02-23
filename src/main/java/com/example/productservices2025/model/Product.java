package com.example.productservices2025.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//All the attributes will get getter & setter.
// Instead of using multiple lines of code, we are using Lombok annotations
public class Product extends Basemodel{
    private String title;
    private double price;
    private Category category;

}
