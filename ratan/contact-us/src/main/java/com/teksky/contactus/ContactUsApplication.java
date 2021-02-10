package com.teksky.contactus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ContactUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactUsApplication.class, args);
	}

//	@Bean
//	public MongoTemplate getMongoTemplate() {
//		return new
//	}

}
