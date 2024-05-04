package com.sunbeam;

public class Product implements Comparable<Product> {
	
	int id;
	String name;
	String category;
	double price;
	
	public Product() {
	}
	

	public Product(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.category.compareTo(o.category);
	}

	
	
}
