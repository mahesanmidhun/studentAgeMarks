package com.ust;

public class StudentMarks {
	private String subjectName;
	private float subjectMark;
	
	
	public StudentMarks(String subjectName, float subjectMark) {
		super();
		this.subjectName = subjectName;
		this.subjectMark = subjectMark;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public float getSubjectMark() {
		return subjectMark;
	}
	public void setSubjectMark(float subjectMark) {
		this.subjectMark = subjectMark;
	}
	@Override
	public String toString() {
		return "StudentMarks [subjectName=" + subjectName + ", subjectMark=" + subjectMark + "]";
	}
	
	

}
