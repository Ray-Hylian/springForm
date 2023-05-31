package com.example.springForm.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.springForm.DTO.FormationDTO;
import com.example.springForm.entities.FormationEntity;

@Component
public class FormationMapper {
	
	ModelMapper modelMapperToDto = new ModelMapper();
	ModelMapper modelMapperToEntity = new ModelMapper();
	
	public FormationDTO mapToDto(FormationEntity formationEntity) {
		FormationDTO formationDTO = modelMapperToDto.map(formationEntity, FormationDTO.class);
		formationDTO.setId(formationEntity.getId());
		formationDTO.setTitle(formationEntity.getTitle());
		formationDTO.setUsers(formationEntity.getUsers());
		return formationDTO;
	}
	
	public FormationEntity mapToEntity(FormationDTO formationDTO) {
		FormationEntity formationEntity = modelMapperToEntity.map(formationDTO, FormationEntity.class);
		formationEntity.setId(formationDTO.getId());
		formationEntity.setTitle(formationEntity.getTitle());
		formationEntity.setUsers(formationEntity.getUsers());
		return formationEntity;
	}
	
	public List<FormationDTO> mapToDto(List<FormationEntity> users) {
		return users.stream().map(this::mapToDto).toList();
	}

}
