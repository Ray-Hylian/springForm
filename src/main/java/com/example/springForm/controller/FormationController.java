package com.example.springForm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springForm.DTO.FormationDTO;
import com.example.springForm.mapper.FormationMapper;
import com.example.springForm.service.FormationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FormationController {

	@Autowired
	private FormationService formationService;

	@Autowired
	private FormationMapper formationMapper;

	@GetMapping("/all-formations")
	public List<FormationDTO> getFormations() {
		return formationMapper.mapToDto(formationService.getFormations());
	}

	@PostMapping("/create-formation")
	public void createFormation(@RequestBody FormationDTO formation) {
		formationService.createFormation(formationMapper.mapToEntity(formation));
	}

	@DeleteMapping("/delete-formation/{id}")
	public void deleteFormation(@PathVariable Long id) {
		formationService.deleteFormation(id);
	}

	@PutMapping("/update-formation")
	public void updateFormation(@RequestBody FormationDTO formation) {
		formationService.updateFormation(formationMapper.mapToEntity(formation));
	}

	@DeleteMapping("/delete-all-formations")
	public void deleteAllFormations() {
		formationService.deleteAllFormations();
	}
}
