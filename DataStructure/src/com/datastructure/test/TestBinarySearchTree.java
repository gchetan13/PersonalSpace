package com.datastructure.test;

import com.datastructure.list.SinglyLinkedList;
import com.datastructure.stack.Node;
import com.datastructure.tree.BinarySearchTree;
import com.datastructure.tree.BinaryTree;

public class TestBinarySearchTree {
	public static void main(String[] args) {
	
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertAtStart(10);
		linkedList.insertAtStart(20);
		linkedList.insertAtStart(30);
		linkedList.insertAtStart(5);
		System.out.println(linkedList);
	
	}
}
