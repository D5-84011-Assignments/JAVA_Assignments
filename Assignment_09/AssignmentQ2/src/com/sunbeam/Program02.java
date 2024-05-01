package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		String string;
		String rev="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your String ");
		string =sc.next();
		
		for(int i =string.length()-1;i>=0;i--) {
			rev +=string.charAt(i);
			
			
		}
		if(string.equals(rev)) {
			System.out.println("String is Palindrom   =  " + rev);
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}

}

