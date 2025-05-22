package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PsaGitExamplesApplication {

	public static void main(String[] args) {
		String name = "mike";
		int x = 100;
		int y = 200;
		double z = 10.3;
		SpringApplication.run(PsaGitExamplesApplication.class, args);
	}

}
