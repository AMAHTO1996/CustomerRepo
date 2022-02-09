package com.amit.customer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amit.customer.entities.UserDO;
import com.amit.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerService;
	
	@GetMapping("/")
	public String getHome() {
		return "Welcome to Spring boot Application developed by Amitkumar ";
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserDO user) {
		return customerService.registerUser(user);
		
	}
	
	@GetMapping("/findall")
	public List<UserDO> findAllUser() {
		return customerService.findAllUser();
	}
	
	@GetMapping("/find#id")
	public UserDO findUserById(Long Id) {
		return customerService.findById(Id);
	}

}
