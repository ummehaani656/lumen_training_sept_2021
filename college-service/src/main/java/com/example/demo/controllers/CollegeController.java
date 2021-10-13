package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

	@GetMapping("/colleges")
public String getCollege() {
	return "The National Institute of Engineering,Mysuru";
}
}
