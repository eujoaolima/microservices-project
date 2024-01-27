package com.microservicesspringcloudproject.microservicesspringcloudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesSpringCloudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSpringCloudProjectApplication.class, args);
		System.out.println("Server Running ;)");
	}

}
