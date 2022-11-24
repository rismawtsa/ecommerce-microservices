package com.risma.productservice.service;

import java.util.List;

import com.risma.productservice.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();

    List<Product> searchProducts(String query);

    Product createProduct(Product product);

    Product getProductByProductId(Long productId);
}
