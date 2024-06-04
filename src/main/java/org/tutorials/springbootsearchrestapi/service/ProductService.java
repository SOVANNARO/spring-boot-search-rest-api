package org.tutorials.springbootsearchrestapi.service;

import org.tutorials.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
