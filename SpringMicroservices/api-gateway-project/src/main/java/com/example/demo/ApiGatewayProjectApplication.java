package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayProjectApplication.class, args);
	}

	@Bean
	public RouteLocator myCustomRouteLocator(RouteLocatorBuilder builder) {
		String[] method = {"GET", "POST"};
		return builder.routes()
				.route(r->r.path("/catalogs/**").and().method(method).uri("http://localhost:8989"))
				.route(r->r.path("/products/**").and().method(method).uri("http://localhost:8181"))
				.build();
	}
}
