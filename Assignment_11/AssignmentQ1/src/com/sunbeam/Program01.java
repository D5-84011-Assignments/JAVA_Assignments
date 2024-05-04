package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			Student []arr = new Student [10];
		
		int choice = 100;
		do {
			System.out.println("Press 0 to exit..............");
			System.out.println("Press 1 to add Students...............");
			System.out.println("Press 2 to display Students with sorted rollNo............... ");
			System.out.println("Press 3 to display Students with sorted name...............");
			System.out.println("Press 4 to display Students with sorted marks in desc orders................");
			System.out.println("Press 5 to display Students with sorted course name...............");
			
			System.out.println("Enter the choice............");
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thanks for visiting..............");
				break;
				
			case 1:
				System.out.println("Enter the rollNo, name, marks, course of student");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = (new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next()));
					System.out.println("=========================================================");
				}
				break;
				
			case 2:
				System.out.println("Display all students sorted on rollNo");
				class sort implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o1.rollNo,o2.rollNo);
					}
					
				}
				
				sort e = new sort();
				
				Arrays.sort(arr,e);
				
				for (Student element : arr) {
					System.out.println(element);
				}
				break;
				
			case 3:
				System.out.println("Display all the students sorted on names");
				class sort implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						return o1.name.compareTo(o2.name);
					}
					
				}
				
				sort a = new sort();
				
				Arrays.sort(arr,a);
				
				for (Student element : arr) {
					System.out.println(element);
				}
				
				break;
				
			case 4:
				System.out.println("Display all the students sorted with marks in decs orders");
				class sort implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.marks,o1.marks);
					}
					
				}
				
				sort b = new sort();
				
				Arrays.sort(arr,b);
				
				for (Student element : arr) {
					System.out.println(element);
				}
				break;
				
			case 5:
				System.out.println("Display all the student sortedd on course name");
				class sort implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						return o1.course.compareTo(o2.course);
					}
					
				}
				
				sort c = new sort();
				
				Arrays.sort(arr,c);
				
				for (Student element : arr) {
					System.out.println(element);
				}
				break;

			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 5");
			}
			
			
		} while (choice !=0);
		
	}
}
