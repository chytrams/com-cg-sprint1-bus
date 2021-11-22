package com.cg.sprint.bus.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.sprint.bus.model.User;

public interface IUserController {

	public ResponseEntity<User> addBus(User user);
	public ResponseEntity<User> updateBus(User user);
	public ResponseEntity<User> deletebus(int userId);
	public ResponseEntity<User> viewBus(int userId);
	public List<User> viewAllBus();
}
