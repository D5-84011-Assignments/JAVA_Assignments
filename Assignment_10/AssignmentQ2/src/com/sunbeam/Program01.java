package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		Product[] arr = {
				new Product(3,"T shirts","Clothes",500),
				new Product(5,"ZenSleep Pillow","Health & Wellness",5454),
				new Product(8,"EchoBlast Bluetooth Speaker","Electronics",50510),
				new Product(9,"SwiftChill Portable Air Conditioner","Home Appliances",50640),
				new Product(4,"NatureGlow Organic Skincare Set","Beauty & Personal Care",5231600),
				new Product(10,"AdventureGear Camping Tent","Outdoor & Recreation",505440),
				new Product(7,"SavorChef Multi-Cooke","Kitchen Appliances",585100),
				new Product(1,"SmartPaws Pet Feeder","Pet Supplies",521500),
				new Product(6,"GlowRide Electric Scooter","Urban Mobility",21500),
				new Product(2,"EcoClean Laundry Detergent","Household Supplies",565400)
				};
		
		
		System.out.println("Before sorting --> ");
		for (Product product : arr)
			System.out.println(product);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting --> ");
		for (Product product : arr)
			System.out.println(product);
		
		Comparable<Product> c1 = new Product();
		
	}
}
