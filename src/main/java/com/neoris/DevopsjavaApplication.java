package com.neoris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DevopsjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsjavaApplication.class, args);
	}

}
