package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NewsCategoryRepository;
import com.model.NewsCategory;


@Service
public class NewsCategoryServiceImpl implements NewsCategoryService{
	
	
	
	 @Autowired
	    private NewsCategoryRepository newsCategoryRepo;

	  
		@Override
		public NewsCategory saveNewsCategory(NewsCategory newscategory) {
			
			return newsCategoryRepo.save(newscategory);
		}

//	    public void delete(Long id) {
//	        newsCategoryRepository.deleteById(id);
//	    }
//
//	    public NewsCategory findById(Long id) {
//	        return newsCategoryRepository.findById(id).orElse(null);
//	    }


}
