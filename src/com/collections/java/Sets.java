package com.collections.java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

		/**
		 * ---------------------------------------------------------------------------------------
		 */

		/**
		 * It prints the values in ascending order.
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

	}

}
