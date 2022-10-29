package com.amit.customer.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import music.api.entity.MusicDO;
import com.amit.customer.entities.UserDO;
import com.amit.customer.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
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
	public ResponseEntity<List<MusicDO>> getAllMusic(){
		List<MusicDO> l1 = new ArrayList<>();
		MusicDO musicDO1 = new MusicDO(1, "Dil Ka Rishta - Jhankar ", "Tum Na Aaye Ho Tum Naa Aaoge", "https://i.ytimg.com/vi/u5MN540x3Tk/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBFm7IRIOL7RrmB4KqJIu1jKGQwAg", "background_image", false,
				"/", "3.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO2 = new MusicDO(1, "Tera Ye Ishq Mera Fitoor", "Tera Ye Ishq Mera Fitoor Lyrics - Arijit Singh | Neeti Mohan | Ranbir K,Vaani K| Mithoon | Shamshera", "https://i.ytimg.com/vi/j-rne2Q5fao/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBi94CO_468wdRdpIMiePetx9WHcg", "background_image", false,
				"/", "4.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO3 = new MusicDO(1, "Piya O Re Piya", "Piya O Re Piya | Atif Aslam | Shreya Ghoshal | Tere Naal Love Ho Gaya", "https://i.ytimg.com/vi/G4rKD4pRd5E/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAism-wDufEfyetLWuCrBLQoG79Gg", "background_image", false,
				"/", "6.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		l1.add(musicDO1);
		l1.add(musicDO2);
		l1.add(musicDO3);
		return new ResponseEntity<>(l1,HttpStatus.OK);
		
	}

}
