package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@GetMapping("/")
	public String printGreeting()
	{
		return "brunda";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		 MessagingApiAppApplication m = new  MessagingApiAppApplication();
		
		m.printGreeting();
		
	}

}
