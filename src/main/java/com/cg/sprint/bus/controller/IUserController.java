package com.cg.sprint.bus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.cg.sprint.bus.model.User;

public interface IUserController {

	public abstract ResponseEntity<User> loginUser(User user);
	public abstract ResponseEntity<User> addUser(User user);
	public abstract ResponseEntity<User> updateUser(User user);
	public abstract ResponseEntity<User> deleteUser(int userId);
	public abstract ResponseEntity<User> viewUser(int userId);
	public abstract List<User> viewAllUsers();
}