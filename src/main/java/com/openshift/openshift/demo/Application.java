package com.openshift.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

             @GetMapping("/")
	     public String getMessage(){
		return "Welcome to Spring Boot and it is deployed into OpenShift";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
