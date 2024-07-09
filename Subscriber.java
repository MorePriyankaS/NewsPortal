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
import jakarta.persistence.OneToMany;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SubId;
	private String SubName;
	private String SubProfile;
	private String Password;
	private LocalDate DateApproved;
	private LocalDate DateJoined;
	private String AccountStatus;
	private String Username;
	private String Email;
	
	
	
	//one subscriber has many comment
	@OneToMany(mappedBy = "subscriber", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();


	public Subscriber() {
		super();
	}


	public Subscriber(int subId, String subName, String subProfile, String password, LocalDate dateApproved,
			LocalDate dateJoined, String accountStatus, String username, String email, List<Comment> comments) {
		super();
		SubId = subId;
		SubName = subName;
		SubProfile = subProfile;
		Password = password;
		DateApproved = dateApproved;
		DateJoined = dateJoined;
		AccountStatus = accountStatus;
		Username = username;
		Email = email;
		this.comments = comments;
	}


	public int getSubId() {
		return SubId;
	}


	public void setSubId(int subId) {
		SubId = subId;
	}


	public String getSubName() {
		return SubName;
	}


	public void setSubName(String subName) {
		SubName = subName;
	}


	public String getSubProfile() {
		return SubProfile;
	}


	public void setSubProfile(String subProfile) {
		SubProfile = subProfile;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public LocalDate getDateApproved() {
		return DateApproved;
	}


	public void setDateApproved(LocalDate dateApproved) {
		DateApproved = dateApproved;
	}


	public LocalDate getDateJoined() {
		return DateJoined;
	}


	public void setDateJoined(LocalDate dateJoined) {
		DateJoined = dateJoined;
	}


	public String getAccountStatus() {
		return AccountStatus;
	}


	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	

}
