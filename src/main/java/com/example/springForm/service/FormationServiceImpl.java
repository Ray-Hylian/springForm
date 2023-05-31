package com.example.springForm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springForm.entities.FormationEntity;
import com.example.springForm.repository.FormationRepository;

@Service
public class FormationServiceImpl implements FormationService {
	
	@Autowired
	private FormationRepository formationRepository;

	@Override
	public List<FormationEntity> getFormations() {
		return formationRepository.findAll();
	}

	@Override
	public void createFormation(FormationEntity formations) {
		formationRepository.save(formations);
		//System.out.println(formations.toString());
	}

	@Override
	public void deleteFormation(Long id) {
		formationRepository.deleteById(id);
	}

	@Override
	public void updateFormation(FormationEntity formations) {
		formationRepository.save(formations);
	}

	@Override
	public void deleteAllFormations() {
		formationRepository.deleteAll();
	}

}
