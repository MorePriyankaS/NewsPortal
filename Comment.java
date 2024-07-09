package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;




@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CommentId;

    private String content;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_Id")
    //ManyToOne  comment news
 
    private News news;
    
    
    
    //oneTomany one user has many comments
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    //many comment has one subscriber
    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    private Subscriber subscriber;
    
    
    
    // Constructors, getters, setters
    

	public Comment() {
		super();
	}



	public Comment(Long commentId, String content, News news, User user, Subscriber subscriber) {
		super();
		CommentId = commentId;
		this.content = content;
		this.news = news;
		this.user = user;
		this.subscriber = subscriber;
	}



	public Long getCommentId() {
		return CommentId;
	}



	public void setCommentId(Long commentId) {
		CommentId = commentId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public News getNews() {
		return news;
	}



	public void setNews(News news) {
		this.news = news;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Subscriber getSubscriber() {
		return subscriber;
	}



	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}



}