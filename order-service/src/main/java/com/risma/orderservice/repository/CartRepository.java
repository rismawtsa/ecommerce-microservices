package com.risma.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.risma.orderservice.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByCartId(Long cartId);

    // void deleteCartById(Long cartId);
}
