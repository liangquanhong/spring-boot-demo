package com.giant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.printle("Hello world!");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
