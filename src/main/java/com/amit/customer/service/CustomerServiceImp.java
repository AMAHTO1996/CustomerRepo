package com.amit.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import com.amit.customer.dao.UserDAO;
import com.amit.customer.entities.UserDO;

@Service
public class CustomerServiceImp implements CustomerService{

	//private UserDAO userDAO;
	@Override
	public String registerUser(UserDO userDO) {
	  // userDAO.save(userDO);
	   return "";
	}
	@Override
	public List<UserDO> findAllUser() {
		return null;
		//return userDAO.findAll();
	}

	@Override
	public UserDO findById(Long Id) {
		return null;
		//return userDAO.getById(Id);
	}

}
