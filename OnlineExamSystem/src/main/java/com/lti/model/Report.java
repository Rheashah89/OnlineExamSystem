package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TBL_REPORT")
public class Report {

	@Id
	@Column(name="REPORT_ID")
	private int reportId;
	
	@JoinColumn(name="EXAM_ID")
	private Exam exam;
	
	@Column(name="CLEARED_LEVEL")
	private int clearedLevel;
	
	@Column(name="TOTAL_MARKS")
	private int totalMarks;
	
	
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public int getClearedLevel() {
		return clearedLevel;
	}
	public void setClearedLevel(int clearedLevel) {
		this.clearedLevel = clearedLevel;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
