package com.amit.customer.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import music.api.entity.MusicDO;
import com.amit.customer.entities.UserDO;
import com.amit.customer.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import org.hibernate.engine.jdbc.StreamUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

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
		MusicDO musicDO1 = new MusicDO(1, "Dil Ka Rishta - Jhankar ", "Tum Na Aaye Ho Tum Naa Aaoge", "https://amahto.jfrog.io/artifactory/Image/Screenshot%202022-10-29%20163739.jpg", "background_image", false,
				"/", "3.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO2 = new MusicDO(2, "Tera Ye Ishq Mera Fitoor", "Tera Ye Ishq Mera Fitoor Lyrics - Arijit Singh | Neeti Mohan | Ranbir K,Vaani K| Mithoon | Shamshera", "https://i.ytimg.com/vi/j-rne2Q5fao/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBi94CO_468wdRdpIMiePetx9WHcg", "background_image", false,
				"/", "4.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO3 = new MusicDO(3, "Piya O Re Piya", "Piya O Re Piya | Atif Aslam | Shreya Ghoshal | Tere Naal Love Ho Gaya", "https://i.ytimg.com/vi/G4rKD4pRd5E/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAism-wDufEfyetLWuCrBLQoG79Gg", "background_image", false,
				"/", "6.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		l1.add(musicDO1);
		l1.add(musicDO2);
		l1.add(musicDO3);
		return new ResponseEntity<>(l1,HttpStatus.OK);
		
	}
	
	@GetMapping("/music/{id}")
	public ResponseEntity<?> getMusic(@PathVariable("id") long id){
		List<MusicDO> l1 = new ArrayList<>();
		MusicDO musicDO1 = new MusicDO(1, "Dil Ka Rishta - Jhankar ", "Tum Na Aaye Ho Tum Naa Aaoge", "https://i.ytimg.com/vi/u5MN540x3Tk/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBFm7IRIOL7RrmB4KqJIu1jKGQwAg", "background_image", false,
				"/", "3.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO2 = new MusicDO(2, "Tera Ye Ishq Mera Fitoor", "Tera Ye Ishq Mera Fitoor Lyrics - Arijit Singh | Neeti Mohan | Ranbir K,Vaani K| Mithoon | Shamshera", "https://i.ytimg.com/vi/j-rne2Q5fao/hqdefault.jpg?sqp=-oaymwEXCOADEI4CSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLBi94CO_468wdRdpIMiePetx9WHcg", "background_image", false,
				"/", "4.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		MusicDO musicDO3 = new MusicDO(3, "Piya O Re Piya", "Piya O Re Piya | Atif Aslam | Shreya Ghoshal | Tere Naal Love Ho Gaya", "https://i.ytimg.com/vi/G4rKD4pRd5E/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAism-wDufEfyetLWuCrBLQoG79Gg", "background_image", false,
				"/", "6.50", 178, 12, 7.8, "/",
				"field1", "field2", "field3", "field4", "field5");
		l1.add(musicDO1);
		l1.add(musicDO2);
		l1.add(musicDO3);
		System.out.println("id::"+id);
		Optional<MusicDO> res= l1.stream().filter(e -> e.getId()==id).findAny();//.map(e -> e).collect(Collectors.toList());
		
		return new ResponseEntity<>(res,HttpStatus.OK);
		
	}
	
	@GetMapping("/downloadVideo/{fileId}")
   	public ResponseEntity<Resource> downloadVideo(@PathVariable String fileId) throws Exception {
    	RestTemplate restTemplate = new RestTemplate();
    	File file = restTemplate.execute("https://amahto.jfrog.io/artifactory/Image/RamSiyaRam.mp3", HttpMethod.GET, null, clientHttpResponse -> {
    	    File ret = File.createTempFile("download", ".mp3");
    	    StreamUtils.copy(clientHttpResponse.getBody(), new FileOutputStream(ret));
    	    return ret;
    	});
    	byte[] content = null;
    	try {
    	    content = Files.readAllBytes(file.toPath());
    	} catch (final IOException e) {
    	}
        return  ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + file.getName()
                + "\"")
                .body(new ByteArrayResource(content.clone()));
    }
    
    @GetMapping("/downloadImage/{fileId}")
    public ResponseEntity<Resource> downloadImage() throws Exception {
    	RestTemplate restTemplate = new RestTemplate();
    	File file = restTemplate.execute("https://amahto.jfrog.io/artifactory/Image/dil.jpg", HttpMethod.GET, null, clientHttpResponse -> {
    	    File ret = File.createTempFile("download", ".jpg");
    	    StreamUtils.copy(clientHttpResponse.getBody(), new FileOutputStream(ret));
    	    return ret;
    	});
    	byte[] content = null;
    	try {
    	    content = Files.readAllBytes(file.toPath());
    	} catch (final IOException e) {
    	}
        return  ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + file.getName()
                + "\"")
                .body(new ByteArrayResource(content.clone()));
    }

}
