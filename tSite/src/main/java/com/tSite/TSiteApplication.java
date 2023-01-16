package com.tSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TSiteApplication {

	public static void main(String[] args) {
		SpringApplication app = new  SpringApplication(TSiteApplication.class);
		System.out.println("test");
		app.run(TSiteApplication.class, args);
	}

}
