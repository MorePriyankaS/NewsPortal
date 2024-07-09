package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CommentRepository;
import com.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	
	@Autowired
    private CommentRepository commentRepo;
	@Override
	public Comment saveComment(Comment comment) {				
				
				return  commentRepo.save(comment);
			}

	}


