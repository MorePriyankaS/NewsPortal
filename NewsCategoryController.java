package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.NewsCategory;
import com.service.NewsCategoryService;

@RestController
@RequestMapping("/ncc")
public class NewsCategoryController {
	

	  @Autowired
	    private NewsCategoryService newscategoryService;

	    @PostMapping("/addNewsCategory")
	    public ResponseEntity<NewsCategory> save(@RequestBody NewsCategory newscategory) {
	        NewsCategory nc = newscategoryService.saveNewsCategory(newscategory);
	        return  ResponseEntity.status(HttpStatus.CREATED).header("add","newscategory added").body(nc);
	    }

	    

}
