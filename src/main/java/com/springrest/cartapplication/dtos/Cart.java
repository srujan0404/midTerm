package com.springrest.cartapplication.dtos;

import com.springrest.cartapplication.dtos.services.CartProductDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Cart {
    Long id;
    Long userId;
    LocalDate date;
    CartProductDto[] products;
}
