package com.datastructure.stack;

public class StackMain {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(12);
		System.out.println(stack.top());
		stack.push(15);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		//stack.pop();
		System.out.println(stack.top());
		System.out.println(stack);
	}

}
