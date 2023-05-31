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

import com.example.springForm.DTO.SubscriptionDTO;
import com.example.springForm.mapper.SubscriptionMapper;
import com.example.springForm.service.SubscriptionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@Autowired
	private SubscriptionMapper subscriptionMapper;

	@GetMapping("/all-subscriptions")
	public List<SubscriptionDTO> getSubscriptions() {
		return subscriptionMapper.mapToDto(subscriptionService.getSubscriptions());
	}

	@PostMapping("/create-subscription")
	public void createSubscription(@RequestBody SubscriptionDTO subscription) {
		subscriptionService.createSubscription(subscriptionMapper.mapToEntity(subscription));
	}

	@DeleteMapping("/delete-subscription/{id}")
	public void deleteSubscription(@PathVariable Long id) {
		subscriptionService.deleteSubscription(id);
	}

	@PutMapping("/update-subscription")
	public void updateSubscription(@RequestBody SubscriptionDTO subscription) {
		subscriptionService.updateSubscription(subscriptionMapper.mapToEntity(subscription));
	}

	@DeleteMapping("/delete-all-subscriptions")
	public void deleteAllSubscriptions() {
		subscriptionService.deleteAllSubscriptions();
	}
	
}
