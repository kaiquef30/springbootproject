package com.projectspringboot.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan
@SpringBootApplication
@EnableMongoRepositories("com.projectspringboot.springbootproject")
public class SpringbootprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectApplication.class, args);
	}

}


