package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.News;
import com.service.NewsService;

@RestController
@RequestMapping("/nc")
public class NewsController {
	
	
	  @Autowired
	    private NewsService newsService;
	  
	  
	  @PostMapping("/addNews")
		public ResponseEntity<News> saveNews(@RequestBody News news)
		{
			News n=newsService.saveNews(news);
			return  ResponseEntity.status(HttpStatus.CREATED).header("add","news added").body(n);
		}
	  
	  
	  

//	  @PostMapping("/addNews")
//	    public ResponseEntity<News> createNews(@RequestBody News news) {
//	        News savedNews = newsService.saveNews(news);
//	        return new ResponseEntity<>(savedNews, HttpStatus.CREATED);
//	    }

//	    @GetMapping("/{id}")
//	    public ResponseEntity<News> getNewsById(@PathVariable Long id) {
//	        News news = newsService.findById(id);
//	        if (news != null) {
//	            return new ResponseEntity<>(news, HttpStatus.OK);
//	        } else {
//	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	        }

}
