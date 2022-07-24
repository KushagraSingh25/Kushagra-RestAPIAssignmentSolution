package com.employeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagementSystem.entity.Role;
import com.employeeManagementSystem.service.RoleServiceImpl;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	@Autowired
	private RoleServiceImpl roleService;
	
	@PostMapping("/addRole")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
}
