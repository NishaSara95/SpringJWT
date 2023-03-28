package com.springboot.springbootJWT;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootJwtApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootJwtApplication.class, args);
		log.info("Application started");
	}

}
