package com.labs.scloud.discovery.service;

import com.labs.scloud.discovery.model.Product;

import java.util.Collection;

public interface ProductService {
    public Collection<Product> getAllProducts();
    public Product getProduct(int id);
    public int createProduct(Product product);
}
