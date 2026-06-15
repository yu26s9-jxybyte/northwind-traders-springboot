package com.pluralsight.northwind_traders_springboot.model;

import jakarta.persistence.Id;

public class Product {
    @Id
    private int productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    }

