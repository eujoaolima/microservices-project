package com.hrgatewayapizuul.hrgatewayapizuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrGatewayApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrGatewayApiZuulApplication.class, args);
		System.out.println("Server running ;)");
	}

}
