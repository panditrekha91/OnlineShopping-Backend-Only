package com.Aspire.OnlineShopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		
		System.out.println("This is Online shopping application");
		
		// Here we are handling exception 
		// also use validation such as @Notblank, @email
		// here also handling the one to many relationship
		
	}

}
