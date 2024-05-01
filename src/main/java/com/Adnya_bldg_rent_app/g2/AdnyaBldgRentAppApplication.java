package com.Adnya_bldg_rent_app.g2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AdnyaBldgRentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdnyaBldgRentAppApplication.class, args);
		
	}

}
