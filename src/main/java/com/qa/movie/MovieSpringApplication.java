package com.qa.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MovieSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieSpringApplication.class, args);
	}

}
