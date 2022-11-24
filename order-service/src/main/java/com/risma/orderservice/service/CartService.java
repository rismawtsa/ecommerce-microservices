package com.risma.orderservice.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risma.orderservice.entity.Cart;
import com.risma.orderservice.repository.CartRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart saveCart(Cart cart) {
        log.info("CartService|saveCart");
        return cartRepository.save(cart);
    }

    // public Cart updateCart(Cart cart, Long cartId) {
    // Cart cartDB = cartRepository.findByCartIdAndProductId(cartId,
    // cart.getProductId());

    // if (Objects.nonNull(cartDB) ) {
    // cartDB.setProductId(cart.getProductId());
    // }

    // }
}
