package com.labs.scloud.discovery.service;

import com.labs.scloud.discovery.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    @Qualifier("objKafkaTemplate")
    private KafkaTemplate<String,Product> kafkaTemplate;

    private Map<Integer, Product> products = new HashMap<>();

    public ProductServiceImpl() {
        // Initialize some sample products
        products.put(1, new Product(1, "Product 1", "Product 1", 10.99));
        products.put(2, new Product(2, "Product 2", "Product 2", 15.99));
        products.put(3, new Product(3, "Product 3", "Product 1",20.99));
    }

    @Override
    public Collection<Product> getAllProducts() {
        return products.values();
    }

    @Override
    public Product getProduct(int id) {
        return products.get(id);
    }

    @Override
    public int createProduct(Product product) {
        product.setId(products.size() + 1);  // Assign unique ID to the new product
        products.put(product.getId(), product);

        // Send the new product to Kafka topic
//        kafkaTemplate.send("product-events", "Product created. ID - " + product.getId());
        kafkaTemplate.send("product-events", product);
        return product.getId();
    }
}
