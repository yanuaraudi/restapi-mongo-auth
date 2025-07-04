package com.example.restapi_mongo_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RestapiMongoAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiMongoAuthApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passowrdEncoder() {
		return new BCryptPasswordEncoder();
	}
}
