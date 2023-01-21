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
		
		//Offer can also be used instead of add. Difference is present at last
		minheap.offer(100);

		System.out.println(minheap);

		//Iterating a PQ.
		Iterator<Integer> iter = minheap.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		/**
		 * This is max heap. Maximum element is at the root always. 
		 * Whenever we poll the element, everytime we get max element present in the queue.
		 * 
		 */
		
		System.out.println("************Max Heap*******************");
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
		maxheap.add(20);
		maxheap.add(50);
		maxheap.add(10);
		maxheap.add(70);
		maxheap.add(90);
		maxheap.add(30);
		
		// Printing the top element of PriorityQueue
		System.out.println(maxheap.peek());
		
		// Printing the top element and removing it from the PriorityQueue container
		System.out.println(maxheap.poll());
		
		//Printing the top element again
		System.out.println(maxheap.peek());
		
	}
}
/**
 * Difference between Offer and Add 

The two functions come from two different interfaces that PriorityQueue implements:

-> add() comes from Collection.
-> offer() comes from Queue.

For a capacity-constrained queue, the difference is that add() always returns true and throws an exception 
if it can't add the element, whereas offer() is allowed to return false if it can't add the element.

However, this doesn't apply to PriorityQueue; the two functions are synonymous.
 */







