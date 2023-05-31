package com.example.springForm.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class SimpleUserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;
	
	@Column(name = "user_firstname")
	private String firstname;
	
	@Column(name = "user_lastname")
	private String lastname;
	
	@Column(name = "user_email")
	private String email;
	
	@ManyToMany(cascade = {
	        CascadeType.ALL
	    })
	    @JoinTable(
	        name = "users_formations",
	        joinColumns = {
	            @JoinColumn(name = "user_id")
	        },
	        inverseJoinColumns = {
	            @JoinColumn(name = "formation_id")
	        }
	    )
	private Set<FormationEntity> formations;

	public SimpleUserEntity(long id, String firstname, String lastname, String email, Set<FormationEntity> formations) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.formations = formations;
	}

	public SimpleUserEntity(String firstname, String lastname, String email, Set<FormationEntity> formations) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.formations = formations;
	}

	public SimpleUserEntity() {
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
