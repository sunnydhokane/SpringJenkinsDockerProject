package com.example.JDProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JdProjectApplication {
	@GetMapping("/msg")
	public String show() {
		return "welcome to jenkin sessions";
	}

	public static void main(String[] args) {
		SpringApplication.run(JdProjectApplication.class, args);
	}

}