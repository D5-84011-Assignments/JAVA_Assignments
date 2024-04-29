package com.sunbeam;

import java.util.Scanner;

public class BaseSalaryCommissionEmployee extends CommissionEmployee{
int baseSalary;
public void calclulateSalary() {
	super.calclulateSalary();
	System.out.println("Base Salary:- "+baseSalary+((baseSalary/100)*10));
}
public void accept(Scanner sc) {
	super.accept(sc);
	System.out.println("Enter base salary");
	baseSalary = sc.nextInt();
}
public void display() {
	
}
}

