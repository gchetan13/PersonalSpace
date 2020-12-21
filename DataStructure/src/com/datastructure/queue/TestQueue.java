package com.datastructure.queue;

import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(2);
		queue.enqueue(21);
		queue.enqueue(5);
		queue.enqueue(27);
		queue.enqueue(2);
		
		System.out.println(queue);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		System.out.println(queue);
		queue.dequeue();
		
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
	}

}
