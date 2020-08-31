package com.niit.UserBoott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.UserBoott")
@SpringBootApplication
public class UserBoottApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBoottApplication.class, args);
	}

}
