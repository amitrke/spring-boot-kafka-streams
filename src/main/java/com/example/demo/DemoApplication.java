package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Consumer<String> consumer() {
		return message -> {
			System.out.println("Received message: " + message);
		};
	}

	@Bean
	public Supplier<String> supplier() {
		return () -> new String("Hello world!");
	}
	
}
