package com.labs.scloud.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ScloudDiscoveryServiceApplication implements CommandLineRunner {

	@Autowired
	DiscoveryClient discoveryClient;



	public static void main(String[] args) {
		SpringApplication.run(ScloudDiscoveryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("scloud-product-service");
		log.info("Service instances for scloud-product-service: {}", serviceInstances);
//		RestTemplate restTemplate = new RestTemplate();
//		serviceInstances.forEach(serviceInstance -> {
//            log.info("Service ID: {}, Host: {}, Port: {}, URI: {}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort(), serviceInstance.getUri());
//			String response = restTemplate.getForEntity(serviceInstance.getUri().toString() + "/products", String.class).getBody();
//			log.info("Response from scloud-product-service: {}", response);
//        });
	}
}
