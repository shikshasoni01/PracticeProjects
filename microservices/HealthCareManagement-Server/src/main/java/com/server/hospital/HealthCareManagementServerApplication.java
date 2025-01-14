package com.server.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HealthCareManagementServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareManagementServerApplication.class, args);
	}

}
