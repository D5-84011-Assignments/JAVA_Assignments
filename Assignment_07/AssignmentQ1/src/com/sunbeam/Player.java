package com.sunbeam;

import java.util.Scanner;

public abstract class Player implements Batter,Bowler {
	int id;
	String name;
	int age;
	int matchesPlayed;
	
	@Override
	public int getRuns() {
		return 0;}
	
	@Override
	public int getWickets() {
		return 0;}
	
	public abstract void accept(Scanner sc);
	public abstract void display();
}
