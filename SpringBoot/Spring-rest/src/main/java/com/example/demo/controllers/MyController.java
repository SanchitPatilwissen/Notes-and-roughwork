package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(path="/", produces="text/html")
	public String abc() {
		return "<h1>Welcome to website<h1>";
	}
	
	@GetMapping("/greet")
	public String greet1() {
		return "<h1>Have a Good day :)<h1>";
	}
	
	@PostMapping("/greet2")
	public String greet2() {
		return "<h1>Have a Good day :) (Post)<h1>";
	}
	
	@PutMapping("/greet3")
	public String greet3() {
		return "<h1>Have a Good day :) (Put)<h1>";
	}
	
	@DeleteMapping("/greet4")
	public String greet4() {
		return "<h1>Have a Good day :) (Delete)<h1>";
	}
	
	@PatchMapping("/greet5")
	public String greet5() {
		return "<h1>Have a Good day :) (Patch)<h1>";
	}
}
