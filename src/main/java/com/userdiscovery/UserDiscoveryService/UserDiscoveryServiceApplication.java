package com.userdiscovery.UserDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDiscoveryServiceApplication.class, args);
	}
}
