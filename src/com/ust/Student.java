package com.ust;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int id;
	private String studentName;
	private String department;
	private int age;
	private List<StudentMarks> marks = new ArrayList<StudentMarks>();
	private int totalMarks;
	
	public Student(int id, String studentName, String department, int age,  List<StudentMarks> marks, int totalMarks) {
		super();
		this.marks = marks;
		this.id = id;
		this.totalMarks = totalMarks;
		this.age = age;
		this.studentName = studentName;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<StudentMarks> getMarks() {
		return marks;
	}

	public void setMarks(List<StudentMarks> marks) {
		this.marks = marks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", department=" + department + ", age=" + age
				+ ", marks=" + marks + "]";
	}
	


}
