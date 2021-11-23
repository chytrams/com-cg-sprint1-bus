package com.cg.sprint.bus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.sprint.bus.model.User;
import com.cg.sprint.bus.service.IUserService;

@RestController
public class IUserController {
	
private static final Logger LOG = LoggerFactory.getLogger(IUserController.class);
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		LOG.info("addUser Controller");
		User u = userService.addUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been added to the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		LOG.info("updateUser Controller");
		User u = userService.updateUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been updated in the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}
	

	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable int userId){
		LOG.info("deleteUser Controller");
		User u = userService.deleteUser(userId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been deleted in the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/viewUser/{userId}")
	public ResponseEntity<User> viewUser(@PathVariable(name = "userId") int userId){
		LOG.info("viewUser Controller");
		User u = userService.viewUser(userId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This is the available bus");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}
	
	

	
	@GetMapping("/viewAllUsers")
	public List<User> viewAllUsers() {
		LOG.info("viewAllUser Controller");
		return userService.viewAllUsers();
		
	}	
}