package com.tcp.storeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.tcp.storeService"})
@SpringBootApplication
public class TheCentrePointStoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCentrePointStoreServiceApplication.class, args);
	}

}
