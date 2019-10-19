package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER")
public class User {

	@Id
	@Column(name="USER_ID")
	private int userID;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_DOB")
	private LocalDate userDateOfBirth;
	
	@Column(name="USER_MOBILE")
	private long userMobile;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="USER_PASSWORD")
	private String userPassword;
	
	@OneToOne
	@JoinColumn(name="USER_CITY")
	private City userCity;
	
	@OneToOne
	@JoinColumn(name="USER_STATE")
	private State userState;
	
	@Column(name="USER_ROLE")
	private char userRole;
	
	@OneToOne
	@JoinColumn(name="USER_DEGREE")
	private Degree userDegree;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getUserDateOfBirth() {
		return userDateOfBirth;
	}
	public void setUserDateOfBirth(LocalDate userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}
	public long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public City getUserCity() {
		return userCity;
	}
	public void setUserCity(City userCity) {
		this.userCity = userCity;
	}
	public State getUserState() {
		return userState;
	}
	public void setUserState(State userState) {
		this.userState = userState;
	}
	public char getUserRole() {
		return userRole;
	}
	public void setUserRole(char userRole) {
		this.userRole = userRole;
	}
	public Degree getUserDegree() {
		return userDegree;
	}
	public void setUserDegree(Degree userDegree) {
		this.userDegree = userDegree;
	}
	
	
}
