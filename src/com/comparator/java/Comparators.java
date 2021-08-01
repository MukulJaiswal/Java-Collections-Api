package com.comparator.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Sort a Laptop based on brand and ram - Then use comparator
 * @author Mukul
 *
 */
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

class RamSorter implements Comparator<Laptop> {

	@Override
	public int compare(Laptop var1, Laptop var2) {

		return var1.getRam() - var2.getRam();
	}
}

class BrandSorter implements Comparator<Laptop> {

	@Override
	public int compare(Laptop var1, Laptop var2) {

		return var1.getBrand().compareTo(var2.getBrand());
	}
}

public class Comparators {
	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<Laptop>();

		laps.add(new Laptop("Dell", 4, 40000));
		laps.add(new Laptop("Asus", 16, 80000));
		laps.add(new Laptop("Lenovo", 8, 60000));
		laps.add(new Laptop("Acer", 12, 50000));

		List<Laptop> laps1 = new ArrayList<Laptop>();

		laps1.add(new Laptop("Asus", 4, 40000));
		laps1.add(new Laptop("Asus", 16, 80000));
		laps1.add(new Laptop("Asus", 8, 60000));
		laps1.add(new Laptop("Asus", 12, 50000));
		
		List<Laptop> laps2 = new ArrayList<Laptop>();

		laps2.add(new Laptop("Asus", 4, 40000));
		laps2.add(new Laptop("Asus", 16, 80000));
		laps2.add(new Laptop("Asus", 8, 60000));
		laps2.add(new Laptop("Asus", 12, 50000));

		/**
		 * using Comparator, we need not to implement any class. Just declare an object
		 * and define a compare() function inside it. Collection.sort() will take two
		 * parameters, one is list and other is object of comparator.
		 */

		/**
		 * Below is the anonymous inner class It is a inner class without a name and for
		 * which only single object is created.
		 * 
		 * I can also define a separate class like I have done for RamSorter/BrandSorter
		 */
		Comparator<Laptop> comparator = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop l1, Laptop l2) {

				if (l1.getPrice() > l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		RamSorter RamSorter = new RamSorter();
		BrandSorter BrandSorter = new BrandSorter();

		Collections.sort(laps, comparator);

		Collections.sort(laps1, BrandSorter.thenComparing(RamSorter));

		laps1.sort((a, b) -> a.getPrice() - b.getPrice());
		
		laps2.sort(Comparator.comparing(Laptop::getBrand).thenComparing(Laptop::getRam));
		
		for (Laptop lap : laps) {
			System.out.println(lap);
		}
		
		System.out.println("--------------------------");

		for (Laptop lap : laps1) {
			System.out.println(lap);
		}
		
		System.out.println("--------------------------");

		for (Laptop lap : laps2) {
			System.out.println(lap);
		}
		
		System.out.println("***********************************");
		Laptop laptopMap = new Laptop("Asus", 4, 40000);
		HashMap<Laptop, String> hmap = new HashMap<Laptop, String>();
		hmap.put(laptopMap, laptopMap.getBrand());
		laptopMap.setBrand("XXX");
		System.out.println(laptopMap);
		System.out.println(hmap);
		System.out.println("Data :: " + hmap.get(laptopMap));//We are not able to get the data.
		
		//Sorting HashMap
		List<Map.Entry<Laptop, String>> list = new ArrayList<Entry<Laptop, String>>(hmap.entrySet());
		list.sort((e1,e2) -> e1.getValue().compareTo(e2.getValue()));
		
		for (Entry<Laptop, String> entry : list) {
			//print the hashmap or store in another hashmap
		}
		
		
		
	}	

}

/**
 * 

+------------------------------------------------------------------------------------+
¦               Comparable                ¦                Comparator                ¦
¦-----------------------------------------+------------------------------------------¦
¦ java.lang.Comparable                    ¦ java.util.Comparator                     ¦
¦-----------------------------------------+------------------------------------------¦
¦ int objOne.compareTo(objTwo)            ¦ int compare(objOne, objTwo)              ¦
¦-----------------------------------------+------------------------------------------¦
¦ Negative, if objOne < objTwo            ¦ Same as Comparable                       ¦
¦ Zero,  if objOne == objTwo              ¦                                          ¦
¦ Positive,  if objOne > objTwo           ¦                                          ¦
¦-----------------------------------------+------------------------------------------¦
¦ You must modify the class whose         ¦ You build a class separate from to sort. ¦
¦ instances you want to sort.             ¦ the class whose instances you want       ¦
¦-----------------------------------------+------------------------------------------¦
¦ Only one sort sequence can be created   ¦ Many sort sequences can be created       ¦
¦-----------------------------------------+------------------------------------------¦
¦ Implemented frequently in the API by:   ¦ Meant to be implemented to sort          ¦
¦ String, Wrapper classes, Date, Calendar ¦ instances of third-party classes.        ¦
+-----------------------------------------------------------------------------------


 */




