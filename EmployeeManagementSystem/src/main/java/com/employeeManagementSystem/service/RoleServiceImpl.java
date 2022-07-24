package com.employeeManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagementSystem.entity.Role;
import com.employeeManagementSystem.repository.RoleRepository;

@Service
public class RoleServiceImpl {

	@Autowired
	private RoleRepository roleRepository;
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
}
