package com.collections.java;

import java.util.ArrayList;
import java.util.Vector;

public class VectorvsArraylist {
	public static void main(String[] args) {

		/**
		 * Vector by default increases the size of its array by 100% As we exceed the
		 * values above 10, then v.capacity returns 20. It is thread save but not
		 * practically
		 */
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);

		System.out.println(v.capacity()); // prints 10

		/**
		 * Arraylist increases the size by 50%. So it is more efficient as it saves
		 * memory. It is not thread save.
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();

	}

}
