package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
 protected String firstName;
 protected String lastName;
 protected int SSN;
 public abstract void calclulateSalary();

public void accept(Scanner sc) {
	// TODO Auto-generated method stub
	
}

public abstract void display();
}
