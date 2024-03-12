package com.springrest.cartapplication.services;

import com.springrest.cartapplication.dtos.Cart;
import com.springrest.cartapplication.dtos.services.CartProductDto;
import com.springrest.cartapplication.dtos.services.CreateOrUpdateProducts;
import com.springrest.cartapplication.dtos.services.CreateOrUpdateProductsResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CartService extends Http{
    public CartService() {
        this.init("https://fakestoreapi.com/carts");
    }

    public Cart[] getAllCarts() {
        return client.getForObject("/", Cart[].class);
    }

    public Cart getCartById(Long id) {
        return client.getForObject("/" + id, Cart.class);
    }

    public Cart[] getCartsInADateRange(LocalDate startDate, LocalDate endDate) {
        return client.getForObject("?startdate=" + startDate + "&enddate="+endDate, Cart[].class);
    }

    public Cart[] getCartsByUserId(Long userId) {
        return client.getForObject("/user/" + userId, Cart[].class);
    }

    public CreateOrUpdateProductsResponse addNewProducts(Long userId, LocalDate date, CartProductDto[] products) {
        CreateOrUpdateProducts requestBody = new CreateOrUpdateProducts(userId, date, products);
        return client.postForObject("/", requestBody, CreateOrUpdateProductsResponse.class);
    }

    public void updateProducts(Long cartId, Long userId, LocalDate date, CartProductDto[] products) {
        CreateOrUpdateProducts requestBody = new CreateOrUpdateProducts(userId, date, products);
        client.put("/" + cartId, requestBody);
    }

    public void deleteCartById(Long cartId) {
        client.delete("/" + cartId);
    }
}
