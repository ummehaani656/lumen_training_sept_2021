package com.example.demo.model;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {
	@Autowired
	public List<CreditCard> cards;
	
	@GetMapping(path="/cards/{id}")
	public CreditCard getCardById(@PathVariable("id") int  id) {
		List<CreditCard> card=this.cards.stream().filter(e ->e.getCardNumber()==id).collect(Collectors.toList());
		return card.get(0);
	}
	
}
