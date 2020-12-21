package com.datastructure.list;


public class DoublyLinkedList {
	Node first;
	Node last;
	int size=0;
	
	public DoublyLinkedList() {
	first=null;
	last=null;
	size=0;
	}
	public int size(){
		return size;
	}
	
	
	public void addLast(Integer a){
		final Node l = last;
		
		Node newNode = new  Node(null, a, null);
		if(last==null && first==null){
			first = newNode;
			last=newNode;
		}
		else{
			last.next=newNode;
			newNode.prev = last;
			last = newNode;
		}
		size++;
	}
	public void addFirst(Integer a){
		Node f = first;
		Node node = new Node(null, a, first);
		if(first==null){
			first = node;
			last=first;
		}
		else{
			node.next=first;
			first.prev = node;
			first=node;
		}
		size++;
	}
	
/*	public Integer removefirst(){
		
	}*/
	public Integer removeLast(){
		Integer lastItem;
		if(last == null || first ==null)
			return null;
		else{
			Node l = last;
			Node newLast = last.prev;
			lastItem = l.item;
			if(newLast==null){
				first=null;
				last=null;
			}
			else{ 
			newLast.next=null;
			last=newLast;
			}
			size--;
			return lastItem;
		}
		
		
	}
	
	public void insert(Integer num,int index){
		Node node = new Node(null, num, null);
		if(first==null){
			first=node;
			last = node;
			size++;
			return;
		}
		if(index>size){
			System.out.println("can not insert at this index , must be lower than size of the list");
		}
		Node temp = first;
		for(int i=0;i<index-1;i++){
			temp = temp.next;
		}
		node.next=temp.next;
		node.prev = temp;
		temp.next.prev=node;
		temp.next = node;
		size++;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node node = first;
		while(node!=null){
			builder = builder.append(node.item+" ");
			node=node.next;
		}
		return builder.toString();
	}
	
	public void reverse(){
		Node prev = null;
		Node current = first;
		//last = current;
		Node next;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current=next;
		}
		last = first;
		first = prev;
	}
	public void reverseRecursion(){
		last = first;
		reverseUsingRecursion(first);
	}
	public void reverseUsingRecursion(Node root){
		if(root.next==null){
			first = root;
			first.prev =null;
			return;
		}
		reverseUsingRecursion(root.next);
		root.next.next = root;
		root.prev = root.next;
		root.next = null;
	}
	
	public void printFromLast(){
		StringBuilder builder = new StringBuilder();
		Node node = last;
		while(node!=null){
			builder = builder.append(node.item+" ");
			node=node.prev;
		}
		System.out.println(builder.toString());
	}
	
	
}
