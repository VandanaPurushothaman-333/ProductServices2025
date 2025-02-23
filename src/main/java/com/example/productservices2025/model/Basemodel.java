package com.example.productservices2025.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

//To maintain common attributes here in this base model, so that it won't be repeated in all the "child" classes
public class Basemodel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
