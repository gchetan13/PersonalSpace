package com.datastructure.test;

import com.datastructure.list.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList linkedList =  new SinglyLinkedList();
		linkedList.insertAtStart(10);
		linkedList.insertAtStart(20);
		linkedList.insertAtStart(30);
		System.out.println(linkedList);
		
		linkedList.insertAtPos(5, 2);
		linkedList.insertAtPos(15, 1);
		System.out.println(linkedList);
		
		linkedList.insertAtPos(500, 1);
		System.out.println(linkedList);
		
//		linkedList.deleteAtpos(2);
		System.out.println(linkedList);
		linkedList.deleteAtpos(1);
		System.out.println(linkedList);
//		System.out.println(linkedList);
//		linkedList.reverse();
//		System.out.println("Print");
//		linkedList.print();
//		System.out.println();
		//System.out.println("Print reverse");
		//linkedList.printreverse();
		//linkedList.reverseRecursion();
		//linkedList.rotateRight(5);
		System.out.println(linkedList.nFromLast(4));
	}

}
