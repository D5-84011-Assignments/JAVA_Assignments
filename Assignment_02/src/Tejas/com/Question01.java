package Tejas.com;


import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = input.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter pending balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total items charged this month: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits applied this month: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int allowedCredit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Display new balance
            System.out.println("New balance: " + newBalance);

            // Check if new balance exceeds credit limit
            if (newBalance > allowedCredit) {
                System.out.println("Credit limit exceeded for account number " + accountNumber);
            } else {
                System.out.println("Credit limit not exceeded for account number " + accountNumber);
            }
        }

        input.close();
    }
}

