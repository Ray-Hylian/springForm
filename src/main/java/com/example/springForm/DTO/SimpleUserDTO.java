package com.example.springForm.DTO;

import java.util.Set;

import com.example.springForm.entities.FormationEntity;

public class SimpleUserDTO {

	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private Set<FormationEntity> formations;

	public SimpleUserDTO(long id, String firstname, String lastname, String email, Set<FormationEntity> formations) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.formations = formations;
	}
	
	public SimpleUserDTO(String firstname, String lastname, String email, Set<FormationEntity> formations) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.formations = formations;
	}

	public SimpleUserDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<FormationEntity> getFormations() {
		return formations;
	}

	public void setFormations(Set<FormationEntity> formations) {
		this.formations = formations;
	}

	
}
