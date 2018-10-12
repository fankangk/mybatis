package com.fankk.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fankk.*")
public class MybatisDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisDemoApplication.class, args);
	}
}
