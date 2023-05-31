package com.example.springForm.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springForm.DTO.SubscriptionDTO;
import com.example.springForm.entities.SubscriptionEntity;

@Component
public class SubscriptionMapper {

	ModelMapper modelMapperToDto = new ModelMapper();
	ModelMapper modelMapperToEntity = new ModelMapper();
	
	@Autowired
	private SimpleUserMapper simpleUserMapper;
	
	public SubscriptionDTO mapToDto(SubscriptionEntity subscriptionEntity) {
		SubscriptionDTO subscriptionDTO = modelMapperToDto.map(subscriptionEntity, SubscriptionDTO.class);
		subscriptionDTO.setId(subscriptionEntity.getId());
		subscriptionDTO.setName(subscriptionEntity.getName());
		subscriptionDTO.setStartingDate(subscriptionEntity.getStartingDate());
		subscriptionDTO.setEndingDate(subscriptionEntity.getEndingDate());
		subscriptionDTO.setUser(simpleUserMapper.mapToDto(subscriptionEntity.getSimpleUserEntity()));
		return subscriptionDTO;
	}
	
	public SubscriptionEntity mapToEntity(SubscriptionDTO subscriptionDTO) {
		SubscriptionEntity subscriptionEntity = modelMapperToEntity.map(subscriptionDTO, SubscriptionEntity.class);
		subscriptionEntity.setId(subscriptionDTO.getId());
		subscriptionEntity.setName(subscriptionDTO.getName());
		subscriptionEntity.setStartingDate(subscriptionDTO.getStartingDate());
		subscriptionEntity.setEndingDate(subscriptionDTO.getEndingDate());
		subscriptionEntity.setSimpleUserEntity(simpleUserMapper.mapToEntity(subscriptionDTO.getUser()));
		return subscriptionEntity;
	}

	public List<SubscriptionDTO> mapToDto(List<SubscriptionEntity> subscriptions) {
		return subscriptions.stream().map(this::mapToDto).toList();
	}
}
