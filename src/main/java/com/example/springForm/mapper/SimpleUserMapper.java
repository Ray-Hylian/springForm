package com.example.springForm.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.springForm.DTO.SimpleUserDTO;
import com.example.springForm.entities.SimpleUserEntity;

@Component
public class SimpleUserMapper {
	
	ModelMapper modelMapperToDto = new ModelMapper();
	ModelMapper modelMapperToEntity = new ModelMapper();
	
	public SimpleUserDTO mapToDto(SimpleUserEntity simpleUserEntity) {
		SimpleUserDTO simpleUserDTO = modelMapperToDto.map(simpleUserEntity, SimpleUserDTO.class);
		simpleUserDTO.setId(simpleUserEntity.getId());
		simpleUserDTO.setFirstname(simpleUserEntity.getFirstname());
		simpleUserDTO.setLastname(simpleUserEntity.getLastname());
		simpleUserDTO.setEmail(simpleUserEntity.getEmail());
		return simpleUserDTO;
	}
	
	public SimpleUserEntity mapToEntity(SimpleUserDTO simpleUserDTO) {
		SimpleUserEntity simpleUserEntity = modelMapperToEntity.map(simpleUserDTO, SimpleUserEntity.class);
		simpleUserEntity.setId(simpleUserDTO.getId());
		simpleUserEntity.setFirstname(simpleUserDTO.getFirstname());
		simpleUserEntity.setLastname(simpleUserDTO.getLastname());
		simpleUserEntity.setEmail(simpleUserDTO.getEmail());
		return simpleUserEntity;
	}
	
	public List<SimpleUserDTO> mapToDto(List<SimpleUserEntity> users) {
		return users.stream().map(this::mapToDto).toList();
	}

}
