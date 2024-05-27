package com.Adnya_bldg_rent_app.g2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"request","response","services","security","repository","models","payload","com.Adnya_bldg_rent_app.g2","controllers","jwt"})
@EntityScan(basePackages = {"request","response","services","security","repository","models","payload","com.Adnya_bldg_rent_app.g2","controllers","jwt"})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories("repository")

public class AdnyaBldgRentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdnyaBldgRentAppApplication.class, args);
   //     User u=new User();
   //     u.getEmail();
	}

}
