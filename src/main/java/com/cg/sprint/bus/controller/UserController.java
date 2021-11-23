package com.cg.sprint.bus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.sprint.bus.model.User;
import com.cg.sprint.bus.service.UserService;

import jdk.internal.net.http.common.Log;

@RestController
public class UserController implements IUserController{

	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Override
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		LOG.info("addUser Controller");
		User u = userService.addUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been added to the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}

	@Override
	@PostMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		LOG.info("updateUser Controller");
		User u = userService.updateUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been updated to the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}

	@Override
	@PostMapping("/deleteUser")
	public ResponseEntity<User> deleteUser(@PathVariable(name = "userLoginId") int userLoginId) {
		LOG.info("deleteUser Controller");
		User u = userService.deleteUser(userLoginId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "The User has been deleted from the dataBase");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}

	@Override
	@GetMapping("/viewUser")
	public ResponseEntity<User> viewUser(@PathVariable(name = "userLoginId") int userLoginId) {
		LOG.info("viewUser Controller");
		User u = userService.viewUser(userLoginId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This is the available User");
		ResponseEntity<User> response = new ResponseEntity<User>(u, headers, HttpStatus.OK);
		return response;
	}


//	
	@Override
	@GetMapping()
	public List<User> viewAllUser() {
		LOG.info("viewAllBus Controller");
		return userService.viewAllUser();

	
}
}

