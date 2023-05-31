package com.example.springForm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springForm.entities.SimpleUserEntity;
import com.example.springForm.repository.SimpleUserRepository;

@Service
public class SimpleUserServiceImpl implements SimpleUserService {
	
	@Autowired
	SimpleUserRepository simpleUserRepository;

	@Override
	public List<SimpleUserEntity> getUsers() {
		return simpleUserRepository.findAll();
	}

	@Override
	public void createUser(SimpleUserEntity user) {
		simpleUserRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		simpleUserRepository.deleteById(id);
	}

	@Override
	public void updateUser(SimpleUserEntity user) {
		simpleUserRepository.save(user);
	}

	@Override
	public void deleteAllUsers() {
		simpleUserRepository.deleteAll();
	}
	

}
