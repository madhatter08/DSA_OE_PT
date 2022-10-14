/**
	Name: Leah G. Manalo | BSIT2-1
	PT1: Implement Stack and Queue with Java. Elements of both list (stack and queue) must be user input. 
 * 
 */
package com.dsa.datastructurealgorithm;
import java.util.*;

public class Manalo_PT1 {
	static void myStack() {
		Stack stack = new Stack();
		Scanner sn = new Scanner(System.in);
		System.out.println("\tStack MAX size: 5");
		stack.show();
		
		do {
			System.out.println("\n\n\tChoose what action to take:");
			System.out.println("\t1. PUSH");
			System.out.println("\t2. POP");
			System.out.println("\t3. PEEK");
			System.out.println("\t4. Stack Status");
			System.out.println("\t5. Back");
			System.out.println("\t6. Exit");
			System.out.print("\n\tEnter your choice: ");
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\n\tPUSH demo");
					if(!stack.isFull()) {
						System.out.print("\tEnter value: ");
						int data = sn.nextInt();
						stack.push(data);
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}else {
						System.out.println("\tThe stack is full. Remove some elements!");
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}
					break;
				case 2:
					System.out.println("\n\tPOP demo");
					if(!stack.isEmpty()) {
						stack.pop();
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}else {
						System.out.print("\tOops! The stack is still empty.");
					}
					break;
				case 3:
					System.out.println("\n\tPEEK demo");
					if(!stack.isEmpty()) {
						System.out.print("\tTop element: " + stack.peek());
					}else {
						System.out.print("\tOops! The stack is still empty.");
					}
					break;
				case 4:
					if(stack.isEmpty()) {
						System.out.println("\tStack status: EMPTY.");
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}else if(stack.isFull()) {
						System.out.println("\tStack status: FULL.");
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}else if(!stack.isEmpty() && !stack.isFull()) {
						System.out.println("\tStack status: NOT FULL.");
						System.out.println("\tNo. of elements: " + stack.size());
						stack.show();
					}
					break;
				case 5:
					main(null);
					break;
				case 6:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
			}
		}while(true);
	}
	
	static void myQueue() {
		Queue queue = new Queue();
		Scanner sn = new Scanner(System.in);
		System.out.println("\tQueue MAX size: 5");
		queue.show();
		
		do {
			System.out.println("\n\n\tChoose what action to take:");
			System.out.println("\t1. ENQUEUE");
			System.out.println("\t2. DEQUEUE");
			System.out.println("\t3. Queue Status");
			System.out.println("\t4. Back");
			System.out.println("\t5. Exit");
			System.out.print("\n\tEnter your choice: ");
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\n\tENQUEUE demo");
					if(!queue.isFull()) {
						System.out.print("\tEnter value: ");
						int data = sn.nextInt();
						queue.enQueue(data);
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}else {
						System.out.println("\tThe queue is full. Remove some elements!");
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}
					break;
				case 2:
					System.out.println("\n\tDEQUEUE demo");
					if(!queue.isEmpty()) {
						queue.deQueue();
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}else {
						System.out.print("\tOops! The queue is still empty.");
					}
					break;
				case 3:
					if(queue.isEmpty()) {
						System.out.println("\tQueue status: EMPTY.");
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}else if(queue.isFull()) {
						System.out.println("\tQueue status: FULL.");
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}else if(!queue.isEmpty() && !queue.isFull()) {
						System.out.println("\tQueue status: NOT FULL.");
						System.out.println("\tNo. of elements: " + queue.size());
						queue.show();
					}
					break;
				case 4:
					main(null);
					break;
				case 5:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		do {
			System.out.println("\n\n\tPT1: STACK AND QUEUE IMPLEMENTATION");
			System.out.println("\n\t1. Stack");
			System.out.println("\t2. Queue");
			System.out.println("\t3. Exit Program");
			System.out.print("\n\tEnter your choice: ");
			Scanner sn = new Scanner(System.in);
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\n\tYou have chosen option 1: Stack");
					myStack();
					break;
				case 2:
					System.out.println("\n\tYou have chosen option 2: Queue");
					myQueue();
					break;
				case 3:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
			}
		}while(true);
	}
}
