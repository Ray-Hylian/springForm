package com.example.springForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springForm.entities.SimpleUserEntity;

@Repository
public interface SimpleUserRepository extends JpaRepository<SimpleUserEntity, Long>{
	
}
