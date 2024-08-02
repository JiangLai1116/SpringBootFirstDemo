package com.example.springbootfirstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		SpringApplication.run(SpringBootFirstDemoApplication.class, args);
	}

}
