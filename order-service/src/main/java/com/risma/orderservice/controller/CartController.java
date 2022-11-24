package com.risma.orderservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risma.orderservice.entity.Cart;
import com.risma.orderservice.entity.CartItems;
import com.risma.orderservice.service.CartService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cart")
@Slf4j
public class CartController {

    // @Autowired
    // private CartService cartService;

    @PostMapping("")
    public String saveCart(@Valid @RequestBody List<CartItems> cartItems) {
        log.info("saveCart", cartItems);
        return "ok";

    }

    // @PutMapping("")
    // public Cart updateCart(@Valid @RequestBody Cart cart, @PathVariable("id")
    // Long cartId) {
    // Cart cartDB = cart
    // }

    // @DeleteMapping("/{id}")
    // public String deleteCartById(@PathVariable("id") Long cartId) {
    // log.info("CartService|deleteCartById");
    // return "Deleted Successfully";
    // }
}
