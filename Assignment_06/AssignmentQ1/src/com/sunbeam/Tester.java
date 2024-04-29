package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int choice =0,size=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		Employee [] Employees = new Employee[size];
		do {
			System.out.println("0 to exit");
			System.out.println("1 to accept and calculate salaried employee");
			System.out.println("2 to accept and calculate hourly employee");
			System.out.println("3 to accept and calculate commission employee");
			System.out.println("4 to accept and calculate base salaried commission employee");
			System.out.println("5 to show all details");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1:
				Employees[count]=new SalariedEmployee();
				Employees[count].accept(sc);
				count++;
				break;
			case 2:
				Employees[count]=new HourlyEmployee();
				Employees[count].accept(sc);
				count++;
				break;
			case 3:
				Employees[count]=new CommissionEmployee();
				Employees[count].accept(sc);
				count++;
				break;
			case 4:
				Employees[count]=new BaseSalaryCommissionEmployee();
				Employees[count].accept(sc);
				count++;
				break;
			case 5:
				for (Employee employee : Employees) {
				    if(employee!=null) {
					employee.calclulateSalary();
					}
				    else {break;}
				}
				break;
				
			}
		}while(choice!=0);

	}

}

