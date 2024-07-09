package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Comment;
import com.service.CommentService;

@RestController
@RequestMapping("/cc")
public class CommentController {

	
	@Autowired
	CommentService commentService;
	
	@PostMapping("/addComment")
	public ResponseEntity<Comment>saveComment(@RequestBody Comment comment)
	{
		Comment c=commentService.saveComment(comment);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "comment added").body(c);
		
	}
	
	


}
