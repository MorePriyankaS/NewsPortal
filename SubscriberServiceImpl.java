package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SubscriberRepository;
import com.model.Subscriber;

@Service
public class SubscriberServiceImpl implements SubscriberService{
	@Autowired 
	public SubscriberRepository subscriberRepo;

	@Override
	public Subscriber saveSubscriber(Subscriber subscriber) {
		
		return subscriberRepo.save(subscriber);
	}

	
}
