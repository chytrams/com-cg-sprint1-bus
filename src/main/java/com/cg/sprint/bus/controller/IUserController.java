package com.cg.sprint.bus.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.sprint.bus.model.User;

public interface IUserController {

	public ResponseEntity<User> addUser(User user);
	public ResponseEntity<User> updateUser(User user);
	public ResponseEntity<User> deleteUser(int userLoginId);
	public ResponseEntity<User> viewUser(int userLoginId);
	public List<User> viewAllUser();
}
