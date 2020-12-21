package com.datastructure.tree;

public class Node {
	Integer item;
	Node left;
	Node right;
	public Node( Node left,Integer item, Node right) {
		super();
		this.item = item;
		this.left = left;
		this.right = right;
	}
	public Integer getItem() {
		return item;
	}
	public Node() {
	}
	
}
