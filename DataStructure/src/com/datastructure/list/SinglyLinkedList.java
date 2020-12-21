package com.datastructure.list;

public class SinglyLinkedList {
	private SingleNode head;

	public SinglyLinkedList() {
	}

	public void insertAtStart(int num) {
		SingleNode node = new SingleNode(num, null);
		node.setNext(head);
		head = node;
	}

	public void insertAtPos(int data,int pos){

		SingleNode temp =  new SingleNode(data,null);
		if(pos==1){
			temp.setNext(head);
			head = temp;
		}
		else{
			SingleNode node = head;
			while(--pos>1){
				node = node.getNext();
			}
			temp.setNext(node.getNext());
			node.setNext(temp);
		}
	}
	
	public void rotateRight(int n){
		SingleNode temp = head;
		while(--n>0){
			if(temp.getNext()!=null)
				temp = temp.getNext();
			else{
				System.out.println("can not rotate larger than size of the list");
				return ;
			//	temp = head;
				}
		}
		SingleNode temp1 = head;
		if(temp.getNext()!=null){
		head = temp.getNext();
		temp.setNext(null);
		SingleNode temp2 = head;
		while(temp2!=null && temp2.getNext()!=null){
			temp2 = temp2.getNext();
		}
		if(temp2!=null)
		temp2.setNext(temp1);
		}
	}
	
	public int nFromLast(int pos){
		SingleNode temp =head;
		SingleNode temp1 =head;
		while(--pos>0){
			temp=temp.getNext();
		}
		while(temp.getNext()!=null){
			temp=temp.getNext();
			temp1=temp1.getNext();
		}
		return temp1.getData();
	}
	
	public void deleteAtpos(int pos){
		if(pos==1){
			head = head.getNext();
		}
		else{
			SingleNode node = head;
			while(--pos>1){
				node = node.getNext();
			}
			node.setNext(node.getNext().getNext());
		}	
	}
	
	public void reverse(){
		SingleNode current,prev,next;
		current= head;
		prev=null;
		while(current!=null){
			next=current.getNext();
			current.setNext(prev);
			prev = current;
			current =next;
		}
		head = prev;
	}
	
	public void reverseRecursion(){
		reverseRec(head);
	}
	
	public void reverseRec(SingleNode node){
		if(node.getNext() == null){
			head =node;
			return;
		}
		reverseRec(node.getNext());
		SingleNode temp = node.getNext();
		temp.setNext(node);
		node.setNext(null);
	}
	
	
	
	@Override
	public String toString() {
		SingleNode node = head;
		StringBuilder builder = new StringBuilder();
		while(node!=null){
			builder.append(node.getData()+" -> ");
			node= node.getNext();
		}
		return builder.toString();
	}
	
	public void print(){
		printList(head);
	}
	
	public void printList(SingleNode node){
		if(node!=null){
			System.out.print(node.getData()+" -> ");
			printList(node.getNext());
		}
		else
			return ;
	}
	
	public void printreverse(){
		printListreverse(head);
	}
	
	public void printListreverse(SingleNode node){
		if(node.getNext() != null){
			printListreverse(node.getNext());
		}
			System.out.print(node.getData()+" ->");
	}

	
}
