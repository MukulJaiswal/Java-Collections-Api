package com.collections.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//https://static.javatpoint.com/images/java-collection-hierarchy.png
public class Sets {
	public static void main(String[] args) {

		/**
		 * It is a collection of unique values. It not have duplicate values. Values are
		 * not sorted
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10); // Inserting 10 again

		// returns false because it is not added.
		System.out.println(set.add(10));

		for (Integer i : set) {
			System.out.println(i);
		}
		
		//Set and list can be printed like this
		System.out.println(set);

		/**
		 * ---------------------------------------------------------------------------------------
		 */

		/**
		 * It prints the unique value and in ascending order
		 */
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(10); // Inserting 10 again

		// returns false because it is not added.
		System.out.println(set1.add(10));

		for (Integer i : set1) {
			System.out.println(i);
		}
		
		//This function returns the intersection of the two sets.Means common value
		//This function is also present in list
		set.retainAll(set1);
		
		
		/**
		 * It prints the values in the order in which it is present as well as it contains unique values.
		 */
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		//Use of LinkedHashSet in programs.
		String string = "Java123";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
//*********************************Convert Arraylist to Sets******************************************************
		
		List<Integer > list = new ArrayList();	
		list.add(100);
		list.add(200);
		list.add(200);
		list.add(400);
		
		System.out.println(list);
		
		Set<Integer> sets = new HashSet<Integer>(list);
		
		for (Integer i : sets) {
			System.out.println(i);
		}
	}
}

/**
 * Internal working of HashSet
 * https://www.geeksforgeeks.org/internal-working-of-sethashset-in-java/
 * 
 * HashSet internally uses the HashMap and whatever value we pass in the Set, it creates 
 * a HashMap like hmap.put(valueInsertedInSet, PRESENT)
 * 
 * PRESENT is constant Object.
 * 
 * On duplicate adding, it checks whether hashmap contains the key or not by -
 * map.put(valueInsertedInSet, PRESENT) == null - It will add the element in Set
 */







