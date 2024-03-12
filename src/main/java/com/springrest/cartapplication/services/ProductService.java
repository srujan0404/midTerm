package com.springrest.cartapplication.services;

import com.springrest.cartapplication.dtos.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends Http{
    public ProductService() {
        this.init("https://fakestoreapi.com/products");
    }

    public Product[] getAllProducts() {
        return this.client.getForObject("/", Product[].class);
    }

    public Product getProductById(Long productId) {
        return this.client.getForObject("/" + productId, Product.class);
    }
}
