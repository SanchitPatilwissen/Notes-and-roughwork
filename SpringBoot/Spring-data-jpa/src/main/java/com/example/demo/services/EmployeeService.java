package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Employee;
import com.example.demo.repos.EmpDao;

@Service
public class EmployeeService {
	@Autowired
	EmpDao emp;

	public Iterable<Employee> getEmployees(){
		return emp.findAll();
	}
	
	public Optional<Employee> getEmployee(@PathVariable int id){
		return emp.findById(id);
	}
	
	public String addEmployees(@RequestBody Employee e){
		if(emp.existsById(e.getId())) {
			return "Sorry employee with given ID already exists";
		}
		emp.save(e);
		return "Added Employee successfully!";
	}
	
	public String updateEmployees(@RequestBody Employee e, @PathVariable int id) {
		if(!emp.existsById(id)) {
			return "Sorry ! Employee with given id doesn't exist!";
		}
		emp.save(e);
		return "Employee updated successfully";
	}
	
	public String deleteEmployees(@PathVariable int id){
		if(!emp.existsById(id)) {
			return "Sorry employee with given ID doesn't exist";
		}
		emp.deleteById(id);
		return "Employee deleted successfully";
	}
	
	public Iterable<Employee> getEmployeeByRole(String desig){
		return emp.findByDesignation(desig);
	}
	
	public List<Employee> getEmployeeGreaterThan(@PathVariable int age){
		return emp.findByAgeGreaterThan(age);
	}
	
	public List<Employee> getDesignationSorted(String desig){
		return emp.myCustomQuery(desig);
	}
}
