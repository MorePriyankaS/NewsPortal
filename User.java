package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;
	private String CompleteName;
	private String Profile;
	private String UserName;
	private String Password;
	
	
	
	//One use has many comment
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Comment> comments ;



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(int userId, String completeName, String profile, String userName, String password,
			List<Comment> comments) {
		super();
		UserId = userId;
		CompleteName = completeName;
		Profile = profile;
		UserName = userName;
		Password = password;
		this.comments = comments;
	}



	public int getUserId() {
		return UserId;
	}



	public void setUserId(int userId) {
		UserId = userId;
	}



	public String getCompleteName() {
		return CompleteName;
	}



	public void setCompleteName(String completeName) {
		CompleteName = completeName;
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



	public List<Comment> getComments() {
		return comments;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}



}
