package com.manage.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manage.employees.model.Employee;
import com.manage.employees.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/employees")
	public List<Employee> listAllEmployees(){
		return repository.findAll();
	}
	
	
	
	

}
