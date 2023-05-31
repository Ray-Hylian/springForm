package com.example.springForm.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="subscriptions")
public class SubscriptionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subscription_id")
	private long id;
	
	@Column(name = "subscription_name")
	private String name;
	
	@Column(name = "subscription_startingDate")
	private LocalDate startingDate;
	
	@Column(name = "subscription_endingDate")
	private LocalDate endingDate;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private SimpleUserEntity simpleUserEntity;

	public SubscriptionEntity(long id, String name, LocalDate startingDate, LocalDate endingDate, SimpleUserEntity simpleUserEntity) {
		this.id = id;
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.simpleUserEntity = simpleUserEntity;
	}

	public SubscriptionEntity(String name, LocalDate startingDate, LocalDate endingDate, SimpleUserEntity simpleUserEntity) {
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.simpleUserEntity = simpleUserEntity;
	}

	public SubscriptionEntity() {
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

	public SimpleUserEntity getSimpleUserEntity() {
		return simpleUserEntity;
	}

	public void setSimpleUserEntity(SimpleUserEntity simpleUserEntity) {
		this.simpleUserEntity = simpleUserEntity;
	}

}
