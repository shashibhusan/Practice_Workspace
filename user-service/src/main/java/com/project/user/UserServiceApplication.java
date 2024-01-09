package com.project.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
 	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}

	@Bean
	@LoadBalanced
	WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}

	@Bean
	@LoadBalanced
	public WebClient webClient(){
		return WebClient.builder()
				.baseUrl("http://localhost:9191") // Api gateway / load balancer url
				.build();
	}
}
