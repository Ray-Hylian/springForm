package com.example.springForm.DTO;

import java.time.LocalDate;

public class SubscriptionDTO {
	
	private long id;
	private String name;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private SimpleUserDTO user;

	public SubscriptionDTO(long id, String name, LocalDate startingDate, LocalDate endingDate, SimpleUserDTO user) {
		this.id = id;
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.user = user;
	}

	public SubscriptionDTO(String name, LocalDate startingDate, LocalDate endingDate, SimpleUserDTO user) {
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.user = user;
	}

	public SubscriptionDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalDate getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

	public SimpleUserDTO getUser() {
		return user;
	}

	public void setUser(SimpleUserDTO user) {
		this.user = user;
	}



}
