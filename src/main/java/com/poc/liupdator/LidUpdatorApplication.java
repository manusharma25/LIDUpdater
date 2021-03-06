package com.poc.liupdator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LidUpdatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LidUpdatorApplication.class, args);
	}

	 @Bean 
	    RestTemplate restTemplate() {
		    //hello
	        return new RestTemplate();
	    }    
	
}
