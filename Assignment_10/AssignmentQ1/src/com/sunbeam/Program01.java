package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		Student[] arr = {
				new Student(4,"Tejas",95),
				new Student(1,"Kunal",99),
				new Student(3,"Shubham",94),
				new Student(5,"Rushi",97),
				new Student(2,"Abhi",96)
		};
		
		System.out.println("Before sorting --->");
		for (Student student : arr) 
			System.out.println(student);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting --->");
		for (Student student : arr) 
			System.out.println(student);
		
		Comparable<Student> T = new Student();
			
		
	}
	
}
