package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CreditCardClientControllers {
	@Autowired
	RestTemplate template;
	String BaseURL="http://localhost:9595/cards/";
	@GetMapping(path="/client/cards/{cardNumber}")
	public String getCardDetails(@PathVariable("cardNumber") int id) {
		String url=BaseURL+id;
		return this.template.getForObject(url,String.class);
	}
	

}
