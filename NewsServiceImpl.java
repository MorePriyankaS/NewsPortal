	package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NewsRepository;
import com.model.News;

@Service
public class NewsServiceImpl implements NewsService{
	
	
	@Autowired 
	public NewsRepository newsRepo;

	@Override
	public News saveNews(News news) {
		
		return newsRepo.save(news);
	}
	
/*
   public void delete(Long id) {
       newsRepository.deleteById(id);
   }

   public News findById(Long id) {
       return newsRepository.findById(id).orElse(null);
   }
  */

}
