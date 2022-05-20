package com.example.pockemon.pockemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PockemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PockemonApplication.class, args);
		System.out.println("*** ACTIVIDAD 13 API POCKEMON ***");
		System.out.println("*********************************");
		System.out.println("*********************************");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}