package com.clientapi.clientapispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ClientapispringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientapispringApplication.class, args);
	}

}
