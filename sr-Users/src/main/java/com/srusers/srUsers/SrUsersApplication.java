package com.srusers.srUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SrUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrUsersApplication.class, args);
	}

}