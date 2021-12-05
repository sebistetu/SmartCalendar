package com.getarrays.calendarmanager.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getarrays.calendarmanager.model.UserModel;
import com.getarrays.calendarmanager.service.UserService;

@RestController
@RequestMapping("/login")
public class UserResource {

	private final UserService userService;
	
	public UserResource(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserModel>> getAllUsers() {
		List<UserModel> users = this.userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping("/verify/{username}/{password}")
	public ResponseEntity<Long> verifyLoginUser(@PathVariable("username") String username, 
			@PathVariable("password") String password) {
		List<UserModel> users = this.userService.getAllUsers();
		Long id = null;
		
		for (UserModel user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				id = user.getId();
			}
		}
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
