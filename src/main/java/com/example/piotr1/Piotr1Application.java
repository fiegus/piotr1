package com.example.piotr1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Piotr1Application {

	public static void main(String[] args) {

		SpringApplication.run(Piotr1Application.class, args);
		Calculator calculator = new Calculator();
		calculator.add(2,6);
	}
}
