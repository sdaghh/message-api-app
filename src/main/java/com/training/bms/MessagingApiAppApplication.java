package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	public void printGreeting()
	{
		System.out.println("hello oracle");
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		 MessagingApiAppApplication m = new  MessagingApiAppApplication();
		
		m.printGreeting();
		
	}

}
