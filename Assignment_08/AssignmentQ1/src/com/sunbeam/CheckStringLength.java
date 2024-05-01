package com.sunbeam;

import java.util.Scanner;

//Custom Exception for line length too long
class ExceptionLineTooLong extends Exception {
 public ExceptionLineTooLong() {
     super("The string is too long");
 }
}

public class CheckStringLength {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a string: ");
     String input = scanner.nextLine();

     try {
         if (input.length() > 80) {
             throw new ExceptionLineTooLong();
         }
         System.out.println("Length of the string is: " + input.length());
     } catch (ExceptionLineTooLong e) {
         System.out.println(e.getMessage());
     }

     scanner.close();
 }
}
