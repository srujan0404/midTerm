package com.springrest.cartapplication.controllers;

import com.springrest.cartapplication.dtos.Product;
import com.springrest.cartapplication.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {
    final ProductService productService = new ProductService();

    @GetMapping("/products/")
    public Product[] getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
