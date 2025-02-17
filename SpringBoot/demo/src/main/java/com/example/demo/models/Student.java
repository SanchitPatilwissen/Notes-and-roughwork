package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student implements Person{
	@Value("${rno}")
	private int rollno;
	@Value("${sname}")
	private String name;
	@Value("${std}")
	private int standard;
	
	public String toString() {
		return "Student[name : "+name+", Roll No. : "+rollno+", Standard : "+standard;
	}
}
