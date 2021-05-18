package com.qa.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class HelloFarewell {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloFarewell.class, args);

		Object byNameGreeting = context.getBean("greeting");
//		String byTypeGreeting = context.getBean(String.class);
//		String byBothGreeting = context.getBean("greeting", String.class);

		System.out.println(byNameGreeting);
//		System.out.println(byTypeGreeting);
//		System.out.println(byBothGreeting);

		Object byNameFarewell = context.getBean("farewell");
//		String byTypeFarewell = context.getBean(String.class);
//		String byBothFarewell = context.getBean("farewell", String.class);

		System.out.println(byNameFarewell);
//		System.out.println(byTypeFarewell);
//		System.out.println(byBothFarewell);
	}

	@Bean
	public String greeting() {
		return "Hello, World";
	}

	@Bean
	@Scope("prototype")
	public String farewell() {
		return "Farewell";
	}
}
