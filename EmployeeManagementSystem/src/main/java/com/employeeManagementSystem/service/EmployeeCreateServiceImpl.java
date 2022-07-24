package com.employeeManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagementSystem.entity.Employee;
import com.employeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeCreateServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void registerAnEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
}
