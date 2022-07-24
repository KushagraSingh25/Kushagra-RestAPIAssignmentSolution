package com.employeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagementSystem.entity.Employee;
import com.employeeManagementSystem.service.EmployeeCreateServiceImpl;



@RestController
@RequestMapping("/employee")
public class EmployeeCreateController {
	
	@Autowired
	private EmployeeCreateServiceImpl employeeCreateService;
	
	@PostMapping("/register")
	public void registerNewEmployee(@RequestBody Employee employee) {
		employeeCreateService.registerAnEmployee(employee);
	}

}
