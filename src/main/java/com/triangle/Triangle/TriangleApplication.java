package com.triangle.Triangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.triangle.Triangle.service.TriangleService;
import com.triangle.Triangle.service.TriangleServiceImpl;

@SpringBootApplication
public class TriangleApplication {
	
	@Bean
    public TriangleService getRestTemplate() {
       return new TriangleServiceImpl();   
    }

	public static void main(String[] args) {
		SpringApplication.run(TriangleApplication.class, args);
	}

}
