package com.springrest.cartapplication.controllers;

import com.springrest.cartapplication.dtos.Cart;
import com.springrest.cartapplication.dtos.services.CreateOrUpdateProducts;
import com.springrest.cartapplication.dtos.services.CreateOrUpdateProductsResponse;
import com.springrest.cartapplication.services.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

public class CartController {
    final CartService cartService = new CartService();

    @GetMapping("/carts/")
    public Cart[] getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/carts/{id}/")
    public Cart getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @GetMapping("/carts")
    public Cart[] getCartsInADateRange(@RequestParam LocalDate startdate, @RequestParam LocalDate enddate) {
        return cartService.getCartsInADateRange(startdate, enddate);
    }

    @PostMapping("/carts")
    public CreateOrUpdateProductsResponse postAddANewProduct(@RequestBody CreateOrUpdateProducts body) {
        return cartService.addNewProducts(body.userId, body.date, body.products);
    }

    @PutMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> patchUpdateProducts(@PathVariable Long id, @RequestBody CreateOrUpdateProducts body) {
        cartService.updateProducts(id, body.userId, body.date, body.products);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> deleteCart(@PathVariable Long id) {
        cartService.deleteCartById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
