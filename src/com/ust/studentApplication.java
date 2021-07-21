package com.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * A menu driven Java application that collects student details.
 * Output will be the name of student who scored highest marks and
 * name of student who is oldest.
 */

public class studentApplication {



	public static void main(String[] args) {
		//initializing scanner
		Scanner s = new Scanner(System.in);
		//Array list of Students
		List<Student> students = new ArrayList<Student>();
		System.out.println("Enter number of Students: ");
		int n = s.nextInt();
		//Collecting details of 'n' students.
		for (int i =0; i<n ; i++) {
			//Initializing an array to store marks.
			List<StudentMarks> marks = new ArrayList<StudentMarks>();
			//A variable to store total marks.
			int total = 0;
			System.out.println("Enter student ID: ");
			int id = s.nextInt();
			System.out.println("Enter student name: ");
			String sname = s.next();
			System.out.println("Enter Department: ");
			String dept = s.next();
			System.out.println("Enter age: ");
			int age = s.nextInt();
			System.out.println("Enter number of subjects");
			int sub = s.nextInt();
			for(int j=0; j< sub; j++) {
				System.out.println("Enter Subject Name: ");
				String subname = s.next();
				System.out.println("Enter mark: ");
				int submark = s.nextInt();
				total = total+submark;
				StudentMarks studentMarks = new StudentMarks(subname, submark);
				//Adding the subjects and respective marks to arraylist of marks.
				marks.add(studentMarks);
			}
			Student student = new Student(id, sname, dept, age, marks,total);
			//Adding each student to arraylist of students.
			students.add(i, student);;
		}
		s.close();
		//displaying the students array list.
		for(Student student : students) {
			System.out.println(student);
		}
		//to compare age of two students
		for(int k =0; k<students.size()-1;k++) {
			if(students.get(k).getAge()>students.get(k+1).getAge()) {
				System.out.println(students.get(k).getStudentName() + " is older");
			}
			else
				System.out.println(students.get(k+1).getStudentName() + " is older");

		}
		//to compare the marks of two students
		for(int j =0; j<students.size()-1;j++) {
			if(students.get(j).getTotalMarks()>students.get(j+1).getTotalMarks()) {
				System.out.println(students.get(j).getStudentName() + " scored highest");
			}
			else
				System.out.println(students.get(j+1).getStudentName() + " scored highest");

		}
	
}
}
