package com.collections.java;

import java.util.ArrayList;
import java.util.List;

public class ArraylisttoArray {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];

		// ArrayList to Array Conversion.
		for (int i = 0; i < al.size(); i++)
			arr[i] = al.get(i);

		for (Integer x : arr)
			System.out.println(x + " ");

		System.out.println("Second Method");

		Integer a[] = al.toArray(new Integer[al.size()]);

		// String names[]=list.toArray(new String[list.size()])

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}