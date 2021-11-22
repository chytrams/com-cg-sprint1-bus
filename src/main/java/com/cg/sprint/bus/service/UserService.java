package com.cg.sprint.bus.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

//import com.cg.sprint.bus.exception.UserAlreadyExistsException;
//import com.cg.sprint.bus.exception.UserNotFoundException;
import com.cg.sprint.bus.model.User;
//import com.cg.sprint.bus.repository.UserRepository;

public class UserService implements IUserService{
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		LOG.info("UserService adduser");
		if(userRepository.existsById(user.getUserId())) {
			LOG.info("User already exists");
			throw new UserAlreadyExistsException("User with " + user.getUserId() + " as id already exists");
		}
		else {
			LOG.info("User added");
			return userRepository.save(user);
		}
	}

	@Override
	public User updateUser(User user) {
		LOG.info("UserService updateUser");
		if(userRepository.existsById(user.getUserId())) {
			LOG.info("User exists and will be updated");
			return userRepository.save(user);
		}
		else {
			LOG.info("User does not exist");
			throw new UserNotFoundException("User with " + user.getUserId() + "as Id does not exist");
		}
	}

	@Override
	public User deleteUser(int userId) {
		LOG.info("UserService deleteUser");
		if(userRepository.existsById(userId)) {
			LOG.info("User will be deleted");
			userRepository.deleteById(userId);
			return null;
		}
		else {
			LOG.info("User does not exist");
			throw new UserNotFoundException("User with " + userId + " does not exist");
		}
	}

	@Override
	public User viewUser(int userId) {
		LOG.info("UserService viewUser");
		if(userRepository.existsById(userId)) {
			LOG.info("Viewing user");
			return userRepository.getById(userId);
		}
		else {
			LOG.info("User does not exist");
			throw new UserNotFoundException("User with " + userId + " does not exist");
		}
	}

	

	@Override
	public List<User> viewAllUser() {
		LOG.info("Viewing all users");
		return userRepository.findAll();
	}

	
}
