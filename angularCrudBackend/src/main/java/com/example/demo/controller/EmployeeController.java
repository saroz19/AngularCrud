package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	//get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		
		return employeeRepo.findAll();
	}
}
