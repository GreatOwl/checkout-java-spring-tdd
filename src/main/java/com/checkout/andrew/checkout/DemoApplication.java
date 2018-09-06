package com.checkout.andrew.checkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// public void configurePathMatch(PathMatchConfigurer configurer) {
	// 	configurer.setUseTrailingSlashMatch(false);
	// }

}
