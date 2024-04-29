package com.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
 int grossSales;
 int commissionRate;
	@Override
	public void calclulateSalary() {
		System.out.println("Salary = "+(grossSales/100)*commissionRate);
		
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
			 System.out.println("Enter the gross sales");
			 grossSales = sc.nextInt();
			 System.out.println("Enter the commission rate");
			 commissionRate = sc.nextInt();
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("firstName:- "+firstName);
		System.out.println("lastName:- "+lastName);
		System.out.println("SSN:- "+SSN);
		System.out.println("grossSales:- "+grossSales);
		System.out.println("commissionRate:- "+commissionRate);
		
	}

}

