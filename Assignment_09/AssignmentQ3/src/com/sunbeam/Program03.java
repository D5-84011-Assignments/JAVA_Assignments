package com.sunbeam;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		String string;
		String outPut;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String To Count No of Char");
		string =sc.nextLine();
		
		string =string.replaceAll("[^a-zA-Z]", "");
		outPut =string.replace(" ","");
		
		
		System.out.println("String Length is  :=  "+outPut.length());
	}

}
