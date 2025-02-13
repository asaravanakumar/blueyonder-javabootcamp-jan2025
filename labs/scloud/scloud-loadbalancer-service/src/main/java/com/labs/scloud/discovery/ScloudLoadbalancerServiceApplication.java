package com.labs.scloud.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.web.client.RestTemplate;

@Slf4j
//@LoadBalancerClients
@SpringBootApplication
public class ScloudLoadbalancerServiceApplication implements CommandLineRunner  {

	@Autowired  // injecting RestTemplate
    private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ScloudLoadbalancerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i = 0; i < 5; i++) {
			String response = restTemplate.getForEntity("http://scloud-product-service/products/home", String.class).getBody();
			log.info("Response from Scloud Product Service: " + response);
		}
	}
}
