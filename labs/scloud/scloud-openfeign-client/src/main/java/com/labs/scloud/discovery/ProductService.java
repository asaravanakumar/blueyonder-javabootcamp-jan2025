package com.labs.scloud.discovery;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(name = "scloud-product-service")
public interface ProductService {

    @GetMapping("/products/home")
    public String home();

    @GetMapping("/products")
    public Collection<Product> getProducts();
}
