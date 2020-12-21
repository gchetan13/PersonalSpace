package com.datastructure.stack;

public class Stack {
private Node top;
public Stack() {
	this.top = null;
}
public void push(Integer num){
	Node node = new Node(num, null);
	if(null==top)
		top = node;
	else{
		node.link=top;
		top = node;
	}
}

public Integer pop(){
	if(null==top){
		return null;
	}
	else{
		int data = top.item;
		top = top.link;
		return data;
	}
}

public Integer top(){
	if(null!=top)
		return top.item;
	else
		return null;
}
public boolean isEmpty(){
	return null==top;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	Node node = top;
	while(node!=null){
		builder = builder.append(node.item+" ");
		node=node.link;
	}
	return builder.toString();
}

}
