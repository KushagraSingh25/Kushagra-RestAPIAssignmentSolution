package com.employeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.employeeManagementSystem.entity.Role;
import com.employeeManagementSystem.entity.User;
import com.employeeManagementSystem.repository.RoleRepository;
import com.employeeManagementSystem.repository.UserRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Student Manager!");
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		Role role1 = new Role();
		role1.setName("ADMIN");
		roleRepository.save(role1);
		User user1 = new User();
		user1.setUsername("Kushagra");
		user1.setPassword(encoder.encode("kushagra"));
		List<Role> roles = new ArrayList<Role>();
		roles.add(role1);
		user1.setRoles(roles);
		userRepository.save(user1);		
	}


}
