package com.dsa.datastructurealgorithm;

public class Queue {
	int myQueue[] = new int[5];
	int size, front, rear;
	
	public void enQueue(int data) {
		if(!isFull()) {
			myQueue[rear] = data;
			rear = (rear+1)%5;
			size++;
		}else {
			System.out.println("\tThe queue is full.");
		}
	}
	
	public int deQueue() {
		int data = myQueue[front];
		if(!isEmpty()) {
			front = (front+1)%5;
			size--;
		}else {
			System.out.println("\tThe queue is empty.");
		}
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size<=0;
	}
	
	public boolean isFull() {
		return size>=5;
	}
	
	public void show() {
		System.out.print("\tQueue elements: ");
		if(size<=0) {
			System.out.print("-");
		}else {
			for(int i=0; i<size; i++) {
				System.out.print(myQueue[(front+i)%5] + " ");
			}
		}
	}
}
