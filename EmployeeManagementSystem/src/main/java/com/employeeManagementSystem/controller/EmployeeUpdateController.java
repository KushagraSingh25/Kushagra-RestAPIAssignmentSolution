package com.employeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagementSystem.entity.Employee;
import com.employeeManagementSystem.service.EmployeeUpdateServiceImpl;


@RestController
@RequestMapping("/employee")
public class EmployeeUpdateController {
	
	@Autowired
	private EmployeeUpdateServiceImpl employeeUpdateService;

	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		employeeUpdateService.updateExistingEmployeeDetails(id, employee);
	}
	
}
