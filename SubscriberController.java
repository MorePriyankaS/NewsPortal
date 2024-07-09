package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Subscriber;
import com.service.SubscriberService;

@RestController
@RequestMapping("/sc")
public class SubscriberController {
	
	 @Autowired
	    private SubscriberService subscriberService;
	  
	  
	  @PostMapping("/addSubscriber")
		public ResponseEntity<Subscriber> saveSubscriber(@RequestBody Subscriber subscriber)
		{
		  Subscriber s=subscriberService.saveSubscriber(subscriber);
			return  ResponseEntity.status(HttpStatus.CREATED).header("add","subscriber added").body(s);
		}
	  

}
