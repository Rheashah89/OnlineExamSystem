package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_OPTION")
public class Option {

	@Id
	@Column(name="OPTION_ID")
	private int optionId;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question question;
	
	@Column(name="OPTION_NAME")
	private String option;
	
	@Column(name="CORRECT_OPTION") // y or n
	private char currentOption;

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public Question getQuestionId() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public char getCurrentOption() {
		return currentOption;
	}

	public void setCurrentOption(char currentOption) {
		this.currentOption = currentOption;
	}
	
	
	
}
