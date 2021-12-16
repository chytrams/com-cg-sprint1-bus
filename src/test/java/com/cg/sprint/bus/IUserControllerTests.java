package com.cg.sprint.bus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.cg.sprint.bus.controller.UserController;

@SpringBootTest
public class IUserControllerTests {
	
	@Autowired
	private UserController userController;
	
	@Test
	public void testViewUser() {
		HttpStatus expected = userController.viewUser(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}	

	
	@Test
	public void testdeleteUser() {
		HttpStatus expected = userController.viewUser(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	
}