package com.sunbeam;

import java.util.Scanner;

public class Team {
	
	public static int menu(Scanner sc) {
		System.out.println();
		System.out.println("0. EXIT");
		System.out.println("1. ADD PLAYER");
		System.out.println("2. ALL PLAYERS");
		System.out.println();
		System.out.print("Enter your choice :- ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,counter=0;
		double totalRun = 0;
		Player[] P = new Player[11];
		while((choice = menu(sc)) != 0)
		{
			switch (choice) 
			{
			case 1:
				P[counter] = new Cricketer();
				P[counter].accept(sc);
				counter++;
				break;
				
			case 2:
				if(counter<11)
				{
					for(int i=0;i<counter;i++)
					{
						System.out.println();
						P[i].display();
						totalRun += P[i].getRuns();
						System.out.println("-----------------------------");
					}
					System.out.println("Total run of team :- "+totalRun);
				}
				else
				{
					System.out.println("Sorry, team limit exceeded");
				}
				break;

			default:
				System.out.println("Invalid choice !!!!!!");
				break;
			}
		}
		sc.close();
	}

}

