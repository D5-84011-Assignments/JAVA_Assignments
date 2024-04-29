package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		int choice = 0, num = 0, counter = 0, freshCount = 0, index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the basket");
		num = sc.nextInt();
		Fruit[] Fruits = new Fruit[num];
		do {
			System.out.println("0 To exit");
			System.out.println("1 To Add mango");
			System.out.println("2 To Add Orange");
			System.out.println("3 To Add Apple");
			System.out.println("4 To Display names of all fruits");
			System.out.println("5 To Display Name,color,weight,taste of all fresh fruits");
			System.out.println("6 To Mark a fruit as stale");
			System.out.println("7 To Display tastes of all stale fruits in the basket");
			System.out.println("8 To mark all sour fruits stale");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				if (counter < num) {

					Fruits[counter] = new Mango("Mango", 10.0, "Yellow");
					counter++;
				} else {
					System.out.println("Fruit Basket is full");
				}
				break;
			case 2:
				if (counter < num) {

					Fruits[counter] = new Orange("Orange", 10.0, "Orange");
					counter++;
				} else {
					System.out.println("Fruit Basket is full");
				}
				break;
			case 3:
				if (counter < num) {

					Fruits[counter] = new Apple("Apple", 20.0, "Red");
					counter++;
				} else {
					System.out.println("Fruit Basket is full");
				}
				break;
			case 4:
				for (Fruit fruit : Fruits) {
					System.out.println(fruit.getName());
				}
				break;
			case 5:
				for (Fruit fruit : Fruits) {

					if (fruit.getFresh()) {
						System.out.println(fruit.toString());
					} else {
						System.out.println(fruit.getName() + " At index " + freshCount + " is Rotten");
					}
					freshCount++;
				}
				freshCount = 0;
				break;
			case 6:
				System.out.println("Enter the index of fruit to mark as stale");
				index = sc.nextInt();
				if (index < 0 || index > counter) {
					System.out.println("Invalid Index");
				} else {
					Fruits[index].setFresh(false);
				}

				break;
			case 7:
				for (Fruit fruit : Fruits) {

					if (fruit.getFresh()) {

					} else {
						System.out.println("Taste of fruit at index" + freshCount + " is " + fruit.taste());
					}
					freshCount++;
				}
				freshCount = 0;
				break;
			case 8:
				for (Fruit fruit : Fruits) {
					if (fruit.taste() == "sour") {
						fruit.setFresh(false);
					}
				}
				break;
			default:
				break;
			}
		} while (choice != 0);
	}

}
