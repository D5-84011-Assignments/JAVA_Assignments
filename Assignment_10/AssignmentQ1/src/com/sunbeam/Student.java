package com.sunbeam;

public class Student implements Comparable<Student> {

	int rollNO;
	String name;
	int marks;
	
	public Student() {
}
	
	

	public Student(int rollNO, String name, int marks) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + ", marks=" + marks + "]";
	}

	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.marks,this.marks);
	}
}