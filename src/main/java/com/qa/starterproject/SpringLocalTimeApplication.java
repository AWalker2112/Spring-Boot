package com.qa.starterproject;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLocalTimeApplication {
	
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringExampleApplication.class, args);
        
        Object byName = context.getBean("localTime");
        LocalTime byType = context.getBean(LocalTime.class);
        LocalTime byBoth = context.getBean("localTime", LocalTime.class);

        System.out.println(byName);
        System.out.println(byType);
        System.out.println(byBoth);
    }
	
	@Bean
    public LocalTime localTime() {
        return LocalTime.now();
    }

}