package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Maps {
	public static void main(String[] args) {
		/**
		 * It is a key value pair.
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.hashCode();

		map.put("Mukul", 100);
		map.put("Devesh", 99);
		map.put("John", 90);
		map.put("Andrew", 95);
		System.out.println(map.hashCode());
		
		// It will update the values that matches with the key "Mukul"
		// Key is unique in a Map and its value might be same.
		map.put("Mukul", 92);

		System.out.println(map);
		
		//*******************How to iterate the HashMap starts*****************		
		
		System.out.println("*******************How to iterate the HashMap starts****************");
		// Used to store all keys in a set variable.
		Set<String> set = map.keySet();

		// Here we can print values by its keys stores in Set variable.
		for (String s : set) {
			System.out.println(s + " " + map.get(s));
		}

		// Another method for printing hashmap
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Using Map.forEach
		map.forEach((k,v) -> System.out.print(k + "::" + v + " "));
		
		//Using map.values to print the data
		System.out.println("\nUsing map.values()");
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("*******************How to iterate the HashMap ends****************");

		
		//*******************How to iterate the HashMap ends*****************	
		
		//*******************Convert HashMap to List(Sorting purpose)*****************
		
		System.out.println("\n****************Convert Hashmap to list***************\n");
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		System.out.println(list);
		
		//*******************Sort the HashMap based on keys and Values*****************
		
		System.out.println("\n*******Sort the HashMap based on Keys and Values ");
//		Collections.sort(list, (e1,e2) -> e1.getKey().compareTo(e2.getKey()));//Sort based on key
		Collections.sort(list, (e1,e2) -> e2.getValue() - (e1.getValue()));//sort based on values.e2 first means decending order
		
		//Below will also work
//		list.sort( (e1,e2) -> e1.getKey().compareTo(e2.getKey()));
//		list.sort( (e1,e2) -> e1.getValue() - (e2.getValue()));
		
		
		System.out.println(list);
		
//		map.clear();
		System.out.println(map);
		
		Map<String, Integer> map_sorted = new HashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> val : list) {
			map_sorted.put(val.getKey(), val.getValue());
		}
		
		System.out.println(map_sorted);
		
		/******************Java 8 technique to sort the HashMap*******************************/
		System.out.println("******************Java 8 technique to sort the HashMap**************************");
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("Mukul", 100);
		hmap.put("Devesh", 99);
		hmap.put("John", 90);
		hmap.put("Andrew", 95);
		
		HashMap<String, Integer> sorted = hmap
				.entrySet()
				.stream()
				.sorted((i1,i2) -> i1.getValue() - i2.getValue())
				.collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue ,(e1,e2) -> e1, LinkedHashMap::new));
		
		System.out.println(sorted);	
		
	}
}

//-----All about hashMap/TreeMap/LinkedHashMap
//https://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/
//HashMap allows one null key and multiple null values.
//HashTable and ConcurrentHashMap does not allows null key and values.
//Treemap does not allow null keys because uses comparator to sort the keys


/**
 * Interview Questions
 * 
 * Can we use object as a key in hashmap in Java? --
 * https://howtodoinjava.com/java/collections/hashmap/design-good-key-for-hashmap/
 * 
 * Internal Working of Hashmap-
 * https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
 * 
 * Sort Hashmap based on key and values.
 * 
 * Difference between hashmap and hashtable.
 */

/**
 * Use case of - 
 * HashMap
 * LinkedHashMap
 * TreeMap
 */















