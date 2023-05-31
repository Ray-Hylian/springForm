package com.example.springForm.service;

import java.util.List;

import com.example.springForm.entities.SubscriptionEntity;

public interface SubscriptionService {
	
	public List<SubscriptionEntity> getSubscriptions();
	
	public void createSubscription(SubscriptionEntity subscription);
	
	public void deleteSubscription(Long id);
	
	public void updateSubscription(SubscriptionEntity subscription);
	
	public void deleteAllSubscriptions();

}
