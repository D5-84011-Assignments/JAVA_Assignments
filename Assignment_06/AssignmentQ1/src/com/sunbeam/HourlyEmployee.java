package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
double wage;
int hrs;
@Override
public void calclulateSalary() {
	double total=0;
	double totalExtra=0;
	double finalTotal=0;
	if(wage<=40) {
		finalTotal = wage*hrs;
	}
	else if(wage>40) {
		total = wage*40;
		totalExtra = (wage*1.5)*(hrs-40);
		finalTotal = total + totalExtra;
	}
	System.out.println("Salary = "+ finalTotal);
	
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
		 System.out.println("Enter the wage");
		 wage = sc.nextInt();
		 System.out.println("Enter the hrs");
		 hrs = sc.nextInt();
	
}
@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("firstName:- "+firstName);
	System.out.println("lastName:- "+lastName);
	System.out.println("SSN:- "+SSN);
	System.out.println("wage:- "+wage);
	System.out.println("hrs:- "+hrs);
	
}
}

