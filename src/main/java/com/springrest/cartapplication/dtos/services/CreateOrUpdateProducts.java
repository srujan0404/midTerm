package com.springrest.cartapplication.dtos.services;

import java.time.LocalDate;

public class CreateOrUpdateProducts {
    public Long userId;
    public LocalDate date;
    public CartProductDto[] products;

    public CreateOrUpdateProducts(Long userId, LocalDate date, CartProductDto[] products) {
        this.userId = userId;
        this.date = date;
        this.products = products;
    }
}
