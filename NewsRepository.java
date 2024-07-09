package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.News;

public interface NewsRepository extends JpaRepository<News, Integer>  {

}
