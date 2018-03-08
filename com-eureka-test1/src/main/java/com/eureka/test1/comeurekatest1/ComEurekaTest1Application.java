package com.eureka.test1.comeurekatest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ComEurekaTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(ComEurekaTest1Application.class, args);
	}
}
