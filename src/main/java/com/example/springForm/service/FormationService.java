package com.example.springForm.service;

import java.util.List;

import com.example.springForm.entities.FormationEntity;

public interface FormationService {

	public List<FormationEntity> getFormations();
		
	public void createFormation(FormationEntity formations);
	
	public void deleteFormation(Long id);
	
	public void updateFormation(FormationEntity formations);
	
	public void deleteAllFormations();

}
