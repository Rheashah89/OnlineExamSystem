package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EXAM")
public class Exam {

	@Id
	@Column(name="EXAM_ID")
	private int examId;
	
	@JoinColumn(name="SUBJECT_ID")
	private Subject subjectId;
	
	
	@JoinColumn(name="USER_ID")
	private User userId;
	
	@Column(name="CURRENT_LEVEL")
	private int currentLevel;
	
	@Column(name="NO_OF_ATTEMPTS")
	private int noOfAttempts;
	
	
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public int getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	public int getNoOfAttempts() {
		return noOfAttempts;
	}
	public void setNoOfAttempts(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
	
	
	
}
