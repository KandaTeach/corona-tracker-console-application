package com.corona.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CoronaTrackerConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackerConsoleApplication.class, args);
	}
	
}
