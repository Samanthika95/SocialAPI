package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;


@RestController
public class UserController {
	
	@RequestMapping(value="/users")
	   public List<User> getAllUsers() {
		User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
			
		return Arrays.asList(user1, user2);	
		
	   }


}
