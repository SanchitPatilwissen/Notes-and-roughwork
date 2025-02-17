package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// By default scope is singleton
@Component("emp")
//@Scope("prototype")
@Lazy
public class Employee implements Person{
	@Value("Sanchit")
	private String name;
	@Value("21")
	private int age;
	@Value("25000")
	private int salary;
	@Value("Programmar")
	private String designation;
	@Autowired
	private Address address;
	//@Autowired
	//private Laptop laptop;
	
	public Employee(){
		System.out.println("Employee is created!");
	}
	

	public String toString() {
		System.out.println(address);
		//System.out.println(laptop);
		return "Employee [name : "+name+", age : "+age+", salary : "+salary+", designation : "+designation;
	}
}
