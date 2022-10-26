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
	
		@GetMapping("/allmusic")
	public List<MusicDO> getAllMusic(){
		MusicDO musicDO1 = new MusicDO(1, "Dil Ka Rishta - Jhankar ", "Tum Na Aaye Ho Tum Naa Aaoge", "https://i.ytimg.com/vi/u5MN540x3Tk/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBFm7IRIOL7RrmB4KqJIu1jKGQwAg", "background_image", false,
				"/", "3.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO2 = new MusicDO(1, "title", "description", "https://github.com/AMAHTO1996/amitkumar-portfolio-web/blob/master/images/image_3.jpg", "background_image", false,
				"/", "4.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO3 = new MusicDO(1, "title", "description", "https://github.com/AMAHTO1996/amitkumar-portfolio-web/blob/master/images/image_3.jpg", "background_image", false,
				"/", "6.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		List<MusicDO> l1 = new ArrayList<>();
		l1.add(musicDO1);
		l1.add(musicDO2);
		l1.add(musicDO3);
		return null;
		
	}

}
