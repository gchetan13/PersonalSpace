package com.datastructure.list;

public class Node {
	Integer item;
	Node prev;
	Node next;
	public Node(Node prev,Integer item, Node next) {
		super();
		this.item = item;
		this.prev = prev;
		this.next = next;
	}
	
}
