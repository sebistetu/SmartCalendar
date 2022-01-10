package com.getarrays.calendarmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getarrays.calendarmanager.exceptions.UserNotFoundException;
import com.getarrays.calendarmanager.model.UserModel;
import com.getarrays.calendarmanager.repository.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepo;
	
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public UserModel addUser(UserModel userModel) {
		return this.userRepo.save(userModel);
	}
	
	public List<UserModel> getAllUsers() {
		return userRepo.findAll();
	}
	
	public UserModel updateUser(UserModel userModel) {
		return userRepo.save(userModel);
	}
	
	public void deleteUserModel(Long id) {
		userRepo.deleteById(id);
	}
	
	public UserModel findUserById(Long id) {
		return userRepo.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User with id : " + id + " not found."));
	}
}
