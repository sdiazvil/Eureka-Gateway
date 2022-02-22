package com.bienvenida.bienvenida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BienvenidaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BienvenidaApplication.class, args);
	}

}
