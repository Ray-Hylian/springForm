package com.example.springForm.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="formations")
public class FormationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "formation_id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany(mappedBy = "formations", cascade = {CascadeType.ALL})
	private Set<SimpleUserEntity> users;

	public FormationEntity(long id, String title, Set<SimpleUserEntity> users) {
		this.id = id;
		this.title = title;
		this.users = users;
	}

	public FormationEntity(String title, Set<SimpleUserEntity> users) {
		this.title = title;
		this.users = users;
	}
	
	public FormationEntity() {
		
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

	@Override
	public String toString() {
		return "FormationEntity [id=" + id + ", title=" + title + ", users=" + users + "]";
	}
	
	
	
}
