package com.cg.sprint.bus.service;

import java.util.List;

import com.cg.sprint.bus.model.User;


public interface IUserService {


	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int userId);
	public User viewUser(int userId);
	public List<User> viewAllUser();
}
