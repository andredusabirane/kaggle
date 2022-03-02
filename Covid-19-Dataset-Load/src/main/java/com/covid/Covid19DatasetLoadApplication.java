package com.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Covid19DatasetLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19DatasetLoadApplication.class, args);
	}

}
