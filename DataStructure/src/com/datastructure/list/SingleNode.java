package com.datastructure.list;

public class SingleNode {
private int data;
private SingleNode next;
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public SingleNode getNext() {
	return next;
}
public void setNext(SingleNode next) {
	this.next = next;
}
public SingleNode() {
	// TODO Auto-generated constructor stub
}
public SingleNode(int data, SingleNode next) {
	super();
	this.data = data;
	this.next = next;
}

}
