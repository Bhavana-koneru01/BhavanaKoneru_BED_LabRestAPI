package com.greatlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class StudentmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}
}
