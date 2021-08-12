package com.collections.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrintingArrayList {
	public static void main(String[] args) {

		
		//***************************Defining a list using values - Shortcut************
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		System.out.println(list);
		
		//******************************************************************************
		
		ArrayList<Integer> values = new ArrayList<Integer>();

		values.add(100);
		values.add(200);
		values.add(300);

		// Enhanced For Loop
		for (Integer i : values) {
//			values.add(1000); //This will give concurrent modification exception
//			values.remove(100); //ArrayIndexOutOfBound
			System.out.println(i);
		}
		
		for (int i = 0; i < values.size(); i++) {
//			values.remove(100);////ArrayIndexOutOfBound
//			values.add(300);//Infinite loop
			System.out.println(values.get(i));
		}
		
		//*************************************Iterator*****************************
		
		//Difference between Iterator and ListIterator
		//https://www.geeksforgeeks.org/difference-between-an-iterator-and-listiterator-in-java/
		//Iterator traverses in one direction whereas ListIterator traverses in both direction
		
		/***************Iterator can be used to remove an element while iterating Arraylist*******/
		
//		ListIterator<Integer> iter = values.listIterator();
		Iterator<Integer> iter = values.iterator();
		while (iter.hasNext()) {
			Integer val = iter.next();
			
			if(val == 200) {
				iter.remove();
				System.out.println(val  + "is removed");
			}
		}
		
		System.out.println(values);
		//Used to remove all elements from an arraylist
		values.removeAll(values);
		values.clear();
		
		
		/**
		 * ------------------Convert Array to ArrayList-------------------------
		 * https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/
		 */
		
		String arr[] = {"mukul","king","hello"};
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		list1.add("Good");
		
		System.out.println("List  :" + list1);

		/**
		 * Interview Questions
		 * 
		 * ConcurrentModificationException - How to remove elements from ArrayList while modification.
		 * https://www.tutorialspoint.com/use-iterator-to-remove-an-element-from-a-collection-in-java
		 * Difference between linked list and arraylist - https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/
		 */
	}
}
