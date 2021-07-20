package com.example.thymeleaf.model;

import com.example.thymeleaf.model.entity.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Cart {

    private final Map<Product, Integer> cartMap = new HashMap<>();

    public Map<Product, Integer> getCartMap() {
        return cartMap;
    }

}