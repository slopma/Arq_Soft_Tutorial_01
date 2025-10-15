package com.docencia.tutorial01.controllers;

import jakarta.validation.constraints.Pattern;

import jakarta.validation.constraints.NotEmpty;

public class ProductForm {

    @NotEmpty(message = "The product name is required")

    private String name;
    
    @NotEmpty(message = "The price is required")

    @Pattern(regexp = "^\\d*\\.?\\d+$", message = "The price must be a valid number")

    private String price;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {
        
        this.price = price;
    }

}