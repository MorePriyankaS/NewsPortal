package com.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Comment;


public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
	

}
