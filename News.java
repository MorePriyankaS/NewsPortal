package com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	//private String Category_ID;
	private String NewsTitle;
	private String NewsContent;
	private LocalDate DatePosted;
	private LocalDate DateUpdated;
	private String Status;
	
	
	private String Description;
	
	
	//one news has one newsCategory
	 @OneToOne(mappedBy = "news", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	   @JoinColumn(name = "category_categoryID", referencedColumnName = "categoryID")
	    private NewsCategory newsCategory;

	 
	//many author has one news 
	 @OneToMany(mappedBy = "news",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	    private List<Author> authors = new ArrayList<>();
	
	 
	 	 //many comment one news
	 
	 @OneToMany(mappedBy = "news",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Comment> comment = new ArrayList<>();


	public News() {
		super();
		// TODO Auto-generated constructor stub
	}


	public News(int id, String newsTitle, String newsContent, LocalDate datePosted, LocalDate dateUpdated,
			String status, String description, NewsCategory newsCategory, List<Author> authors, List<Comment> comment) {
		super();
		Id = id;
		NewsTitle = newsTitle;
		NewsContent = newsContent;
		DatePosted = datePosted;
		DateUpdated = dateUpdated;
		Status = status;
		Description = description;
		this.newsCategory = newsCategory;
		this.authors = authors;
		this.comment = comment;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNewsTitle() {
		return NewsTitle;
	}


	public void setNewsTitle(String newsTitle) {
		NewsTitle = newsTitle;
	}


	public String getNewsContent() {
		return NewsContent;
	}


	public void setNewsContent(String newsContent) {
		NewsContent = newsContent;
	}


	public LocalDate getDatePosted() {
		return DatePosted;
	}


	public void setDatePosted(LocalDate datePosted) {
		DatePosted = datePosted;
	}


	public LocalDate getDateUpdated() {
		return DateUpdated;
	}


	public void setDateUpdated(LocalDate dateUpdated) {
		DateUpdated = dateUpdated;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public NewsCategory getNewsCategory() {
		return newsCategory;
	}


	public void setNewsCategory(NewsCategory newsCategory) {
		this.newsCategory = newsCategory;
	}


	public List<Author> getAuthors() {
		return authors;
	}


	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}


	public List<Comment> getComment() {
		return comment;
	}


	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}


	
}
