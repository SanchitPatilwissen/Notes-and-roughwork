package com.example.demo.models.lappy;

import org.springframework.stereotype.Component;

@Component("lenovo")
public class LenovoLaptop implements Laptop{
	public String toString() {
		return "Heyy! You have got LENOVO Laptop";
	}
}
