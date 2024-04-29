package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, double weight, String color) {
		super(color, weight, name, true);
		System.out.println("Apple Added");
	}

	@Override
	public String taste() {
		return "sweet n sour";
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
