package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	private int runs;
	private int wickets;
	
	@Override
	public void accept(Scanner sc) {
		System.out.print("Player id :- ");
		id = sc.nextInt();
		System.out.print("Player name :- ");
		name = sc.next();
		System.out.print("Player age :- ");
		age = sc.nextInt();
		System.out.print("No. of match played by player :- ");
		matchesPlayed = sc.nextInt();
		System.out.print("Player's total run :- ");
		runs = sc.nextInt();
		System.out.print("Player's total wickets :- ");
		wickets = sc.nextInt();
	}
	
	@Override
	public int getWickets() {
		return wickets;
	}

	@Override
	public int getRuns() {
		return runs;
	}


	@Override
	public void display() {
		System.out.println("ID - "+id);
		System.out.println("NAME - "+name);
		System.out.println("AGE - "+age);
		System.out.println("MATCHES PLAYED - "+matchesPlayed);
		System.out.println("TOTAL RUNS  - "+runs);
		System.out.println("TOTAL WICKETS  - "+wickets);
	}

	

}

