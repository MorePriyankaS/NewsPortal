package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.NewsCategory;

public interface NewsCategoryRepository extends JpaRepository<NewsCategory, Integer>  {

}
