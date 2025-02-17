package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.model"})
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);
		
		Object obj = ctx.getBean("employee");
		System.out.println(obj);
	}

}
