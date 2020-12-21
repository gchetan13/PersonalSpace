package com.datastructure.test;

import com.datastructure.list.DoublyLinkedList;

public class TestList {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast(2);
		list.addLast(1);
		list.addLast(13);
		list.removeLast();
		list.addLast(6);
		list.addLast(7);
		//list.removeLast();
		//list.removeLast();
		
		System.out.println(list);
		System.out.println(list.size());
		//list.reverse();
		list.insert(50, 1);
		System.out.println(list);
		list.reverseRecursion();
		//System.out.println(list);
	//	list.printFromLast();
		System.out.println(list);
		list.printFromLast();
		
		/*//System.out.println(-1 <<< 101);
	int x = -1;   
	  
    System.out.println(x>>>-29);  // The value of 'x>>>29' is 00...0111 
    System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011  
    System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001  
*/	}
}
