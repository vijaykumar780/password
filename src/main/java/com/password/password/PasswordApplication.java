package com.password.password;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Log4j2
@EnableAsync
@EnableScheduling
public class PasswordApplication {

	public static void main(String[] args) {
		log.info("Started password app");
		SpringApplication.run(PasswordApplication.class, args);
	}

}
