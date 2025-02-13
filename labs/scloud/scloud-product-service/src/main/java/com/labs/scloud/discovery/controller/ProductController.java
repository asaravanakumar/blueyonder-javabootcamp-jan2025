package com.labs.scloud.discovery.controller;

import com.labs.scloud.discovery.model.Product;
import com.labs.scloud.discovery.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = {"/products", "/products/"})
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/home")
    public String home(HttpServletRequest req) {
        log.info("Received request: {}", req.getRequestURL().toString());
        return "Welcome to the Product Service! from " + req.getRequestURL().toString();
    }


    @GetMapping
    public Collection<Product> getProducts() throws InterruptedException {
        // Implement logic to fetch and return products from a data source

//        Thread.sleep(5000); // sleeps for 5 seconds to simulate data fetching

        return productService.getAllProducts(); // Placeholder for now
    }

    @GetMapping("/{id}")
    public Product getProduct(int id) {
        // Implement logic to fetch and return a product by its ID

        return productService.getProduct(id); // Placeholder for now
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        // Implement logic to create a new product

        if(productService.createProduct(product) > 0) {
            return "Product created successfully";
        } else {
            return "Failed to create product";
        }// Placeholder for now

    }
}
