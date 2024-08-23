package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {
		
	@RequestMapping("/")
	public String home() {
		System.out.println("hi");
		return "Hello World";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

