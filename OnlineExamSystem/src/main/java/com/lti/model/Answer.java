package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ANSWER")
public class Answer {

	@Id
	@Column(name="ANSWER_ID")
	private int answerId;
	
	@JoinColumn(name="EXAM_ID")
	private Exam examId;
	
	@JoinColumn(name="QUESTION_ID")
	private Question questionId;
	
	@Column(name="SELECTED_ID")
	private int selectedId;
	
	@Column(name="SCORE")
	private int score;
	
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public Exam getExamId() {
		return examId;
	}
	public void setExamId(Exam examId) {
		this.examId = examId;
	}
	public Question getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}
	public int getSelectedId() {
		return selectedId;
	}
	public void setSelectedId(int selectedId) {
		this.selectedId = selectedId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
