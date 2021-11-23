package com.cg.sprint.bus.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.bus.exception.UserAlreadyExistsException;
import com.cg.sprint.bus.exception.UserNotFoundException;
import com.cg.sprint.bus.model.User;
import com.cg.sprint.bus.repository.IUserRepository;

@Service
public class IUserService {
	
private static final Logger LOG = LoggerFactory.getLogger(IUserService.class);
	
	@Autowired
	private IUserRepository userRepository;
	
	public User addUser(User user) {
		LOG.info("addService addUser");
		if(userRepository.existsById(user.getUserId())) {
			LOG.info("User already exists");
			throw new UserAlreadyExistsException("User with " + user.getUserId() + " as id already exists");
		}
		else {		
			LOG.info("User added");
			return userRepository.save(user);
		}	
	}	
	public User updateUser(User user) {
		LOG.info("updateService updateUser");
		if(userRepository.existsById(user.getUserId())) {
			LOG.info("user exists and will be updated");
			return userRepository.save(user);
					
		}
		else {
			LOG.info("user does not exists");
			throw new UserNotFoundException("User with " + user.getUserId() + " as Id does not exists");			
		}		
	}
	
	public User deleteUser(int userId) {
		LOG.info("deleteService deleteUser");
		if(userRepository.existsById(userId)) {
			LOG.info("user will be deleted");
			userRepository.deleteById(userId);
			return null;
		}
		else {
			LOG.info("user does not exists");
			throw new UserNotFoundException("User with " + userId + " as Id does not exists");
		}		
	}
	
	public User viewUser(int userId) {
		LOG.info("viewService viewUser");
		if(userRepository.existsById(userId)) {
			LOG.info("Viewing bus");
			return userRepository.getById(userId);
		}
		else {
			LOG.info("User does not exist");
			throw new UserNotFoundException("User with " + userId + " does not exist");
		}
	}
	public List<User> viewAllUsers() {
		LOG.info("Viewing all users");
		return userRepository.findAll();
	}
}