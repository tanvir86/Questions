package com.example.question.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class QuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionApplication.class, args);
	}
}
