/**
 * 	Name: Leah G. Manalo
 * 	PT2: Implementation of double link list in Java.
 * 		 Create your own Node and method.
 */
package com.dsa.datastructurealgorithm;

import java.util.*;
import java.io.*;

public class Manalo_PT2 {
	private Link head;
	private static int size;

	public static void main(String[] args) throws IOException {
		Manalo_PT2 dll = new Manalo_PT2();
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		do {
			//Code block that displays the Main Menu of the program.
			System.out.println("\n\t---------------------------------");
			System.out.println("\tPT2: DOUBLY LINKED LIST");
			System.out.println("\t---------------------------------");
			System.out.println("\tList of My Favorite Artist");
			System.out.println("\n\t1. Insert New Artist");
			System.out.println("\t2. Remove Artist");
			System.out.println("\t3. Display List");
			System.out.println("\t4. Exit Program");
			System.out.print("\n\tEnter your choice: ");
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					//Case 1 is for inserting nodes.
					System.out.println("\n\t-----------INSERT------------");
					System.out.print("\tNumber of Artist to enter: ");
					int num = sn.nextInt();
					for(int i=1; i<=num; i++) {
						System.out.print("\tEnter Artist's name: ");
						String str = sc.nextLine();
						dll.addBack(str);
					}
					System.out.println("\n\tArtist/s added!");
					System.out.print("\n\t-----------UPDATE------------");
					dll.printAll();
					Pause();
					break;
				case 2:
					//Case 2 is for removing nodes. 
					if(dll.isEmpty()) {
						System.out.println("\n\tThe list is empty, please enter data.");
					}else {
						System.out.print("\n\t-----------REMOVE-----------");
						dll.printAll();
						System.out.print("\tEnter Artist's position: ");
						int pos = sc.nextInt();
						dll.removeAt(pos);
						System.out.println("\n\tArtist/s removed!");
						System.out.print("\n\t-----------UPDATE------------");
						dll.printAll();
					}
					Pause();
					break;
				case 3:
					//Case 3 is for displaying all nodes.
					System.out.println("\n\t-----------DISPLAY------------");
					System.out.println("\tList size: " + dll.size());
					System.out.print("\tList elements: ");
					dll.printAll();
					Pause();
					break;
				case 4:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
					Pause();
			}
		}while(true);

	}
	
	//addBack() will add a node at the back of the list
	public void addBack(String data) {
		if(head==null) {
			head = new Link(null, data, null);
		}else {
			Link current = head;
			while(current.next != null) {
				current = current.next;
			}
			Link newLink = new Link(current, data, null);
			current.next = newLink;
		}
		size++;
	}
		
	//removeAt() will remove a node from a specified location in the list
	public void removeAt(int index) {
		if(head == null) {
			return;
		}
		if(index<1 || index>size) {
			return;
		}
		Link current = head;
		int i=1;
		while(i<index) {
			current = current.next;
			i++;
		}
		if(current.next == null) {
			current.previous.next = null;
		}else if(current.previous == null) {
			current = current.next;
			current.previous = null;
			head = current;
		}else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}
		
	public int size() {
		return size;
	}
		
	//print() will display all the nodes in the list
	public void printAll() {
		Link current = head;
		int ctr = 1;
		if(head == null) {
			System.out.println("EMPTY.");
			return;
		}
		System.out.println();
		while(current != null) {
			System.out.println("\t[" + ctr + "] " + current.data);
			current = current.next;
			ctr++;
		}
	}
		
	public boolean isEmpty() {
		return head == null;
	}
		
	static void Pause()throws IOException{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		String any;
		System.out.println("\n\tPress any key to continue...");
		any = in.readLine();
	}
}
