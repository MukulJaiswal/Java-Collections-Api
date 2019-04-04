package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {

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

	/**
	 * If we implements comparable interface then we need to define this function.
	 */
	@Override
	public int compareTo(Laptop lap2) {

		/**
		 * if this > lap2 = positive value
		 * 
		 * if this < lap2 = negative value
		 * 
		 * if this == lap2 = zero
		 */
		if (this.getRam() > lap2.getRam())
			return 1;
		else
			return -1;
	}
}

public class Comparables {
	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<Laptop>();

		laps.add(new Laptop("Dell", 4, 40000));
		laps.add(new Laptop("Asus", 16, 80000));
		laps.add(new Laptop("Lenovo", 8, 60000));

		/**
		 * In order to sort this Laptop class variables, we need a comparable because
		 * laptop class contains more than one data type.
		 * 
		 * Inorder to perform this, implements Comparable interface and declare
		 * compareTo() in that class.
		 * 
		 * Comparable is used to sort the class values having more than one data types.
		 */
		Collections.sort(laps);

		for (Laptop lap : laps) {
			System.out.println(lap);
		}

	}

}
