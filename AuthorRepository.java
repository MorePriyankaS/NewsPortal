package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	

}
