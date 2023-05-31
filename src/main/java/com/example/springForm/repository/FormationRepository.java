package com.example.springForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springForm.entities.FormationEntity;

@Repository
public interface FormationRepository extends JpaRepository<FormationEntity, Long> {

}
