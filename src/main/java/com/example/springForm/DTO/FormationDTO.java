package com.example.springForm.DTO;

import java.util.Set;

import com.example.springForm.entities.SimpleUserEntity;

public class FormationDTO {

	private long id;
	private String title;
	private Set<SimpleUserEntity> users;
	
	public FormationDTO(long id, String title, Set<SimpleUserEntity> users) {
		this.id = id;
		this.title = title;
		this.users = users;
	}

	public FormationDTO(String title, Set<SimpleUserEntity> users) {
		this.title = title;
		this.users = users;
	}

	public FormationDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<SimpleUserEntity> getUsers() {
		return users;
	}

	public void setUsers(Set<SimpleUserEntity> users) {
		this.users = users;
	}

}
