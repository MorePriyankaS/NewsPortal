package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Author {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long AuthorID;

	    private String AuthorName;  
	    private String AuthorEmail;
	    private String Profile;
	    private String UserName;
	    private String Password;
	    private String AccountStatus;
	
	    
	    //many author has one news
	    @ManyToOne
	    @JoinColumn(name = "news_id")
	    private News news;
	    

	    
	    
	    
	 // Constructors, getters, setters
		public Author() {
			super();
			
		}





		public Author(Long authorID, String authorName, String authorEmail, String profile, String userName,
				String password, String accountStatus, News news) {
			super();
			AuthorID = authorID;
			AuthorName = authorName;
			AuthorEmail = authorEmail;
			Profile = profile;
			UserName = userName;
			Password = password;
			AccountStatus = accountStatus;
			this.news = news;
		}





		public Long getAuthorID() {
			return AuthorID;
		}





		public void setAuthorID(Long authorID) {
			AuthorID = authorID;
		}





		public String getAuthorName() {
			return AuthorName;
		}





		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}





		public String getAuthorEmail() {
			return AuthorEmail;
		}





		public void setAuthorEmail(String authorEmail) {
			AuthorEmail = authorEmail;
		}





		public String getProfile() {
			return Profile;
		}





		public void setProfile(String profile) {
			Profile = profile;
		}





		public String getUserName() {
			return UserName;
		}





		public void setUserName(String userName) {
			UserName = userName;
		}





		public String getPassword() {
			return Password;
		}





		public void setPassword(String password) {
			Password = password;
		}





		public String getAccountStatus() {
			return AccountStatus;
		}





		public void setAccountStatus(String accountStatus) {
			AccountStatus = accountStatus;
		}





		public News getNews() {
			return news;
		}





		public void setNews(News news) {
			this.news = news;
		}





		
	   

//	    @ManyToMany(mappedBy = "authors")
//	    private List<News> news = new ArrayList<>();
	    
	    
	    // Constructors, getters, setters
		

		
	    
	    

}
