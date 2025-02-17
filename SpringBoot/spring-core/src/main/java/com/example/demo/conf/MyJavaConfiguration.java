package com.example.demo.conf;

import com.example.demo.models.Employee;

public class MyJavaConfiguration {
	@scope("prototype")
	public Employee getEmployee() {
		return new Employee("Raju", 25, 30000, "Tester");
	}
	
	
}
