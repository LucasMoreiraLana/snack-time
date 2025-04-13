package com.lucas.snacktime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SnacktimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnacktimeApplication.class, args);
	}

}
