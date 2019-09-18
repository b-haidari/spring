package com.bahram.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World Developer!!!";
	}
}

