package com.javab5.java.oops.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {// i/o | MT

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());// Min Heap (TREE)
		priorityQueue.add(5);
		priorityQueue.add(25);
		priorityQueue.add(56);
		priorityQueue.add(775);
		priorityQueue.add(5);
		priorityQueue.add(554);
		priorityQueue.add(25);
		priorityQueue.add(54);
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.peek());// smallest
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
	}
}
