package com.comparator.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop {

	private String brand;
	private int ram;
	private int price;

	public Laptop(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() { 				 	
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

}

public class Comparators {
	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<Laptop>();

		laps.add(new Laptop("Dell", 4, 40000));
		laps.add(new Laptop("Asus", 16, 80000));
		laps.add(new Laptop("Lenovo", 8, 60000));

		/**
		 * using Comparator, we need not to implement any class. Just declare an object
		 * and define a compare() function inside it. Collection.sort() will take two
		 * parameters, one is list and other is object of comparator.
		 */

		/**
		 * Below is the anonymous inner class It is a inner class without a name and for
		 * which only single object is created.
		 */
		Comparator<Laptop> compare = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop l1, Laptop l2) {

				if (l1.getPrice() > l2.getPrice())
					return 1;
				else
					return -1;
			}

		};

		Collections.sort(laps, compare);

		for (Laptop lap : laps) {
			System.out.println(lap);
		}

	}

}
