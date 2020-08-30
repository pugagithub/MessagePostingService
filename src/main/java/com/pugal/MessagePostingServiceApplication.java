package com.pugal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
public class MessagePostingServiceApplication {

	public static void main(String[] args) {
		System.out.println("Hi Pugal");
		SpringApplication.run(MessagePostingServiceApplication.class, args);
	}

}
