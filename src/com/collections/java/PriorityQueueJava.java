package com.collections.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueJava {
	public static void main(String[] args) {

		/**
		 * Minimum element is at the root always.
		 *  By default priority queue is min heap
		 * in java
		 */
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();

		/**
		 * This is max heap.
		 *  Maximum element is at the root always
		 * 
		 */
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
	}
}
