package com.amit.customer.service;

import java.util.List;

import com.amit.customer.entities.UserDO;

public interface CustomerService {
	
	public String registerUser(UserDO userDO);
	
	public List<UserDO>  findAllUser();
	
	public UserDO findById(Long Id);

}
