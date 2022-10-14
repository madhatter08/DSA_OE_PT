package com.dsa.datastructurealgorithm;

public class Stack {
	int myStack[] = new int[5];
	int top = 0;
	
	public void push(int data) {
		if(top==5) {
			System.out.println("\tThe stack is full.");
		}else {
			myStack[top] = data;
			top++;
		}
	}
	
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("\tThe stack is empty.");
		}else {
			top--;
			data = myStack[top];
			myStack[top] = 0;
		}
		return data;
	}
	
	public int peek() {
		int data = 0;
		data = myStack[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public boolean isFull() {
		return top>=5;
	}
	
	public void show() {
		System.out.print("\tStack elements: ");
		for(int n :  myStack) {
			System.out.print(n + " ");
		}
	}

}
