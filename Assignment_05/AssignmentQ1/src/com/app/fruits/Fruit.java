package com.app.fruits;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;

	public Fruit() {

	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String taste() {

		return "no specific taste";
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", taste=" + this.taste() + "]";
	}

	public boolean getFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;

	}

}
