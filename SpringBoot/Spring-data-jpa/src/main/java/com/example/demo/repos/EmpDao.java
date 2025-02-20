package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Employee;

public interface EmpDao extends JpaRepository<Employee, Integer>{
	public Iterable<Employee> findByDesignation(String desig);
	public List<Employee> findByAgeGreaterThan(int age);
	@Query("from Employee where designation=?1 order by age desc")
	public List<Employee> myCustomQuery(String desig);
}
