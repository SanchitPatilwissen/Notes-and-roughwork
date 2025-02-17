package com.example.model;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	public Employee(String name, int age, int salary, String designation) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}

	private String name;
	private int age;
	private int salary;
	private String designation;
	
	Employee(){
		System.out.println("Employee is created!");
	}
	
	public String toString() {
		return "Employee [name : "+name+", age : "+age+", salary : "+salary+", designation : "+designation;
	}
}
