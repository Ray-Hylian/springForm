package com.example.springForm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springForm.DTO.SimpleUserDTO;
import com.example.springForm.mapper.SimpleUserMapper;
import com.example.springForm.service.SimpleUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SimpleUserController {

	@Autowired
	private SimpleUserService userService;

	@Autowired
	private SimpleUserMapper simpleUserMapper;

	@GetMapping("/all-users")
	public List<SimpleUserDTO> getUsers() {
		return simpleUserMapper.mapToDto(userService.getUsers());
	}

	@PostMapping("/create-user")
	public void createUser(@RequestBody SimpleUserDTO user) {
		userService.createUser(simpleUserMapper.mapToEntity(user));
	}

	@DeleteMapping("/delete-user/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@PutMapping("/update-user")
	public void updateUser(@RequestBody SimpleUserDTO user) {
		userService.updateUser(simpleUserMapper.mapToEntity(user));
	}

	@DeleteMapping("/delete-all-users")
	public void deleteAllUsers() {
		userService.deleteAllUsers();
	}
}
