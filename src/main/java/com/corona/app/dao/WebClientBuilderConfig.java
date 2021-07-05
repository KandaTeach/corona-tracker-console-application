package com.corona.app.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBuilderConfig {

    @Bean
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}
	
}
