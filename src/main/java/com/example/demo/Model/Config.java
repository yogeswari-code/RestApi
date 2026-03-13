package com.example.demo.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {

	@Bean
	public WebClient webclient() {
		
		return WebClient.builder().build();
	}
}
