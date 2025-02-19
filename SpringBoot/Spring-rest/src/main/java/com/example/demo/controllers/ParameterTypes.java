package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterTypes {
	@GetMapping("/query")
	public String queryParamDemo(@RequestParam String name, @RequestParam int age) {
		return "<h1>Welcome "+name+" to website and your age is "+age+"<h1>";
	}
	
	@GetMapping("/path/{name}/{age}")
	public String pathParamDemo(@PathVariable String name, @PathVariable int age) {
		return "<h1>Welcome "+name+" to website and your age is "+age+"<h1>";
	}
	
	@GetMapping("/body")
	public String bodyParamDemo(@RequestBody Person p) {
		return "<h1>Welcome "+p.getName()+" to website and your age is "+p.getAge()+"<h1>";
	}
	
	@GetMapping(path="/persons", produces="application/json") // By default in json format
	public List<Person> ListParamDemo() {
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Sanchit Patil", 21));
		persons.add(new Person("Omkar Shirwadkar", 31));
		persons.add(new Person("Kaif Sayyad", 41));
		persons.add(new Person("Sarvesh Birla", 51));
		persons.add(new Person("Shoyab Siddiqui", 61));
		
		return persons;
	}
}
