package com.risma.productservice.repository;

import com.risma.productservice.entity.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE " +
            "p.productName LIKE CONCAT('%',:query, '%')" +
            "Or p.productDescription LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);
}
