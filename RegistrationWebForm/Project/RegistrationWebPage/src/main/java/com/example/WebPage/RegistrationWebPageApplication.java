package com.example.WebPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RegistrationWebPageApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RegistrationWebPageApplication.class, args);
		System.out.println(context.toString());
	}

}
