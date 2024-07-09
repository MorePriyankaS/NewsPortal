package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Author;
import com.service.AuthorService;

@RestController
@RequestMapping("/ac")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@PostMapping("/addAuthor")
	public ResponseEntity<Author>saveAuthor(@RequestBody Author author)
	{
		Author a=authorService.saveAuthor(author);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "author added").body(a);
		
	}
	
	

}

	

	
	


