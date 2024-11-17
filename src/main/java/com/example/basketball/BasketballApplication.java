package com.example.basketball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BasketballApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketballApplication.class, args);
	}

}
