package com.springrest.cartapplication.dtos.services;

import java.time.LocalDate;

public class CreateOrUpdateProductsResponse {
    Long id;
    Long userId;
    LocalDate date;
    CartProductDto[] products;
}
