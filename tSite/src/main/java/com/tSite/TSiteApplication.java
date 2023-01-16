package com.tSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TSiteApplication {

	public static void main(String[] args) {
		SpringApplication app = new  SpringApplication(TSiteApplication.class);
		
		app.run(TSiteApplication.class, args);
	}

}
