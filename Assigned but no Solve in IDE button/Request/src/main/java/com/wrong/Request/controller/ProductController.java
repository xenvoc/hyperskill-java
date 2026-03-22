package com.wrong.Request.controller;

import com.wrong.Request.model.Product;

import java.util.List;

public class ProductController {
    private final List<Product> productList = List.of(
            new Product(1, "Milk"),
            new Product(2, "Sausages"),
            new Product(3, "Butter")
    );

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return productList.get(id - 1);
    }
}
