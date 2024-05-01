package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		String string;
		System.out.println("Enter the string :- ");
		
		Scanner sc = new Scanner(System.in);
		string =sc.next();
		
		StringBuffer str = new StringBuffer(string);
		System.out.println("Rev String is :--   "+str.reverse());
		
	}
}
