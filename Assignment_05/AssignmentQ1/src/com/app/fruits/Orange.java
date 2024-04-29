package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String name, double weight, String color) {
		super(color, weight, name, true);
		System.out.println("Orange Added");
	}

	@Override
	public String taste() {
		return "sour";
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
