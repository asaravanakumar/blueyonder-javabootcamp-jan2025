package com.labs.scloud.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ScloudAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScloudAdminServiceApplication.class, args);
	}

}
