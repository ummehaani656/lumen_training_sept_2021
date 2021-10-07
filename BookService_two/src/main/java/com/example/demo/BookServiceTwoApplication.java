package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookServiceTwoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cxt=	SpringApplication.run(BookServiceTwoApplication.class, args);
	System.out.println("Hello world");
	cxt.close();
	}

}
