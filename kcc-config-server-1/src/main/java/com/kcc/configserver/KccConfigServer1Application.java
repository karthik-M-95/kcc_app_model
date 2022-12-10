package com.kcc.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class KccConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(KccConfigServer1Application.class, args);
	}

}
