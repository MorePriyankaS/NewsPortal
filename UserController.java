package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.model.User;
import com.service.UserService;


@RestController
@RequestMapping("/uc")
public class UserController {

	 @Autowired
	    private UserService userService;
	  
	  
	  @PostMapping("/addUser")
		public ResponseEntity<User> saveUser(@RequestBody User user)
		{
		  User u=userService.saveUser(user);
			return  ResponseEntity.status(HttpStatus.CREATED).header("add","user added").body(u);
		}
	  


}
