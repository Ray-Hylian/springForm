package com.example.springForm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springForm.entities.SubscriptionEntity;
import com.example.springForm.repository.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionRepository;
	
	@Override
	public List<SubscriptionEntity> getSubscriptions() {
		return subscriptionRepository.findAll();
	}

	@Override
	public void createSubscription(SubscriptionEntity subscription) {
		subscriptionRepository.save(subscription);
	}

	@Override
	public void deleteSubscription(Long id) {
		subscriptionRepository.deleteById(id);
	}

	@Override
	public void updateSubscription(SubscriptionEntity subscription) {
		subscriptionRepository.save(subscription);
	}

	@Override
	public void deleteAllSubscriptions() {
		subscriptionRepository.deleteAll();
	}

}
