package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthorRepository;
import com.model.Author;



@Service
public class AuthorSeviceImpl implements AuthorService{
	 
	@Autowired
	    private AuthorRepository authorRepo;

	@Override
	public Author saveAuthor(Author author) {
		
		return authorRepo.save(author);
	}

}
