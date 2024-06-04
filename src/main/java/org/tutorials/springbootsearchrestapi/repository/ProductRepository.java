package org.tutorials.springbootsearchrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.tutorials.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE (p.name LIKE CONCAT('%', :query, '%') OR p.description LIKE CONCAT('%', :query, '%'))")
    List<Product> searchProducts(String query);
}
