package com.example.springForm.service;

import java.util.List;

import com.example.springForm.entities.SimpleUserEntity;

public interface SimpleUserService {

	public List<SimpleUserEntity> getUsers();
		
	public void createUser(SimpleUserEntity user);
	
	public void deleteUser(Long id);
	
	public void updateUser(SimpleUserEntity user);
	
	public void deleteAllUsers();

}
