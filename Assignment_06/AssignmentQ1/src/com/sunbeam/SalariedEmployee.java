package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
int weeklySalary;

@Override
public void calclulateSalary() {
	System.out.println("Weekly Salary = "+weeklySalary);
	
}


@Override
public void accept(Scanner sc) {
	// TODO Auto-generated method stub
	
		 System.out.println("Enter the First Name");
		 firstName = sc.next();
		 System.out.println("Enter the Last Name");
		 lastName = sc.next();
		 System.out.println("Enter the SSN");
		 SSN=sc.nextInt();
		 System.out.println("Enter the weekly salary");
		 weeklySalary = sc.nextInt();
	
}


@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("firstName:- "+firstName);
	System.out.println("lastName:- "+lastName);
	System.out.println("SSN:- "+SSN);
	System.out.println("weeklySalary:- "+weeklySalary);
	
}







}

