package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;

@WebMvcTest(controllers=EmpController.class)
public class EmpControllerTest {
	@MockitoBean
	private EmployeeService empService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetEmployees() { // API testing
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/employees")).andExpect(MockMvcResultMatchers.status().is(200));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetEmployeeBelowAge() { // Service testing
		try {
			List<Employee> lst = new ArrayList<Employee>();
			Mockito.when(empService.getEmployeeGreaterThan(75)).thenReturn(lst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
