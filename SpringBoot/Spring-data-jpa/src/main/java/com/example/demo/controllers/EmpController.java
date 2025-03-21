package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repos.EmpDao;
import com.example.demo.services.EmployeeService;


@RestController
public class EmpController {
	@Autowired
	EmployeeService emp;
	
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees(){
		return emp.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return emp.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee e){
		return emp.addEmployees(e);
	}
	
	@RequestMapping(path = "/employees/{id}", method= {RequestMethod.PUT, RequestMethod.PATCH})
	public String updateEmployees(@RequestBody Employee e, @PathVariable int id) {
		return emp.updateEmployees(e, id);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployees(@PathVariable int id){
		return emp.deleteEmployees(id);
	}
	
	@GetMapping("/employees/role")
	public Iterable<Employee> getEmployeeByRole(String desig){
		return emp.getEmployeeByRole(desig);
	}
	
	@GetMapping("/employees/age/greater/{age}")
	public List<Employee> getEmployeeGreaterThan(@PathVariable int age){
		return emp.getEmployeeGreaterThan(age);
	}
	
	@GetMapping("/employees/custom")
	public List<Employee> getDesignationSorted(String desig){
		return emp.getDesignationSorted(desig);
	}
}
