package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class NewsCategory {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CategoryID;
	private String CategoryName;
	private String CategoryDescription;
	
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_id", referencedColumnName = "id")
	    private News news;

	public NewsCategory() {
		super();
	}

	public NewsCategory(int categoryID, String categoryName, String categoryDescription, News news) {
		super();
		this.CategoryID = categoryID;
		this.CategoryName = categoryName;
		this.CategoryDescription = categoryDescription;
		this.news = news;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	
}
