package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String name, double weight, String color) {
		super(color, weight, name, true);
		System.out.println("Mango Added");
	}

	@Override
	public String taste() {
		return "sweet";
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public String toString() {
		return super.toString();
	}

	public boolean getFresh() {
		return super.getFresh();
	}

	public void setFresh(boolean isFresh) {
		super.setFresh(isFresh);
	}
}
