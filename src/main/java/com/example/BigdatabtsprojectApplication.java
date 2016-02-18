package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource({"classpath*:**/test.xml"})
public class BigdatabtsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigdatabtsprojectApplication.class, args);
	}
}
