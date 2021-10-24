package com.collections.java;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueJava {
	public static void main(String[] args) {

		/**
		 * Minimum element is at the root always. By default priority queue is min heap
		 * in java
		 */
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		minheap.add(20);
		minheap.add(50);
		minheap.add(10);
		minheap.add(70);
		minheap.add(90);
		minheap.add(30);

		System.out.println(minheap);

		//Iterating a PQ.
		Iterator<Integer> iter = minheap.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		/**
		 * This is max heap. Maximum element is at the root always
		 * 
		 */
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
	}
}
