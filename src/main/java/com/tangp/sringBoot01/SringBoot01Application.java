package com.tangp.sringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SringBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(SringBoot01Application.class, args);
	}
}
