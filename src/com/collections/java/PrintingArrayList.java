package com.collections.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PrintingArrayList {
	public static void main(String[] args) {

		List<Object> values = new ArrayList<Object>();

		values.add(100);
		values.add("Mukul");
		values.add(200);

		// Enhanced For Loop
		for (Object i : values) {
			System.out.println(i);
		}
	}
}
