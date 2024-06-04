package org.tutorials.springbootsearchrestapi.service.impl;

import org.springframework.stereotype.Service;
import org.tutorials.springbootsearchrestapi.entity.Product;
import org.tutorials.springbootsearchrestapi.repository.ProductRepository;
import org.tutorials.springbootsearchrestapi.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
