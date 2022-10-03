/**
	Name: Leah G. Manalo | BSIT2-1
	OE4:Implementation of bubble sort and insertion sort in Java programming language. 

		To add: 
		Print the number of iteration in bubble and insertion after the unordered array is sorted.
		The unordered array values must be user entered.
 * 
 */
package com.dsa.datastructurealgorithm;
import java.util.*;

public class Manalo_OE4 {
	static void navDisplay(int[] unsortedList) {
		int len = unsortedList.length;
		System.out.print(" [ ");
		
		//output updated array
		for(int i=0; i<len; i++) {
			System.out.print(unsortedList[i] + " ");
		}
		System.out.println("]");
	}
	
	static void bubbleSort() {
		System.out.println("\n\tYou have chosen option A: Using Bubble Sort");
		
		//Prompting the user to enter array size
		System.out.print("\tEnter the array size: ");
		Scanner sn = new Scanner(System.in);
		int size = sn.nextInt();
		int unsorted_Array[] = new int[size];
		int len = unsorted_Array.length;
				
		//Prompting the user to enter array elements
		for (int x = 0; x < size; x++) {
			System.out.print("\tEnter array values [Position " + (x) + "]: ");
			unsorted_Array[x] = sn.nextInt();
		}
				
		System.out.print("\tUnsorted array list: ");
		for(int x=0; x<len; x++) {
			System.out.print(" " + unsorted_Array[x]);
		}
		System.out.println();
				
		int temp = 0;
		boolean swapped;
		
		for(int x=0; x<size; x++) {
			swapped = false;
			System.out.print("\n\tIteration " + (x+1) + ": ");
			navDisplay(unsorted_Array);
			
			for(int y=0; y<((size-1)-x); y++){
				System.out.print("\tItem " + unsorted_Array[y] + " is compared to item " + unsorted_Array[y+1]);
				if(unsorted_Array[y] > unsorted_Array[y+1]){
					temp = unsorted_Array[y];
					unsorted_Array[y] = unsorted_Array[y+1];
					unsorted_Array[y+1] = temp;
					
					swapped =  true;
					System.out.print(" => swap " + unsorted_Array[y+1] + " and " + unsorted_Array[y] + "\n");
				} else {
					System.out.print(" => do not swap\n");
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.print("\n\tSorted List (Bubble Sort): ");
		for(int x=0; x<len; x++) {
			System.out.print(" " + unsorted_Array[x]);
		}
	}//----------------------------end of bubbleSort()-------------------------------------
	
	static void insertionSort() {
		System.out.println("\n\tYou have chosen option B: Using Insertion Sort");
		
		//Prompting the user to enter array size
		System.out.print("\tEnter the array size: ");
		Scanner sn = new Scanner(System.in);
		int size = sn.nextInt();
		int unsorted_Array[] = new int[size];
		int len = unsorted_Array.length;
				
		//Prompting the user to enter array elements
		for (int x = 0; x < size; x++) {
			System.out.print("\tEnter array values [Position " + (x) + "]: ");
			unsorted_Array[x] = sn.nextInt();
		}
				
		System.out.print("\tUnsorted array list: ");
		for(int x=0; x<len; x++) {
			System.out.print(" " + unsorted_Array[x]);
		}
		System.out.println();
		
		
		for(int x=1; x<len; x++) {
			int y = unsorted_Array[x]; //value to insert
			int z = x; //hole position
			
			System.out.print("\n\tIteration " + x + ": ");
			navDisplay(unsorted_Array);
			
			while ((z > 0) && (unsorted_Array[z-1] > y)) {
				unsorted_Array[z] = unsorted_Array[z-1];
				z--;
				System.out.println("\tItem " + unsorted_Array[z] + " moved right, at position " + (z+1) + ".");
			}
			
			if(z != x) {
				System.out.println("\tItem " + y + " inserted at position " + z + ".");
				unsorted_Array[z] = y;
				
			}
		}
		
		System.out.print("\n\tSorted List (Insertion Sort): ");
		for(int x=0; x<len; x++) {
			System.out.print(" " + unsorted_Array[x]);
		}
	}//-----------------------------------end of insertionSort()---------------------------------------
	
	public static void main(String[] args) {
		do {
			System.out.println("\n\n\tOE4: BUBBLE SORT AND INSERTION SORT IMPLEMENTATION");
			System.out.println("\n\t1. Using Bubble Sort");
			System.out.println("\t2. Using Insertion Sort");
			System.out.println("\t3. Exit Program");
			System.out.print("\n\tEnter your choice: ");
			Scanner sn = new Scanner(System.in);
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					bubbleSort();
					break;
				case 2:
					insertionSort();
					break;
				case 3:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
			}
		}while(true);
	}//------------------------------end of main-----------------------------------
}
