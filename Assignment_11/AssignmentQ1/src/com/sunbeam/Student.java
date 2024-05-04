package com.sunbeam;

public class Student implements Comparable<Student>{

	int rollNo;
	String name;
	int marks;
	String course;
	
    public Student() {
	}
	
	

	public Student(int rollNo, String name, int marks, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}



	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.marks,this.marks);
	}
}
