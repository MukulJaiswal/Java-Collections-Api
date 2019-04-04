package com.collections.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {

		/**
		 * It is a key value pair.
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Mukul", 100);
		map.put("Devesh", 99);
		map.put("John", 90);

		// It will update the values that matches with the key "Mukul"
		//Key is unique in a Map and its value might be same.
		map.put("Mukul", 90);

		System.out.println(map);
		
		//Used to store all keys in a set variable.
		Set<String> set = map.keySet();
		
		//Here we can print values by its keys stores in Set variable.
		for (String s : set) {
			System.out.println(s + " " + map.get(s));
		}
	}

}
