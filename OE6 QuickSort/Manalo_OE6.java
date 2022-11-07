/**
 * 	Name: Leah G. Manalo
 * 	OE6: Quicksort implementation with array using Java PL.
 * 		 The data of the array must be user input.
 * 		 Optional: Create swap method/function.
 */
package com.dsa.datastructurealgorithm;
import java.util.*;
import javax.swing.*;

public class Manalo_OE6 {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to QuickSort App!", "QuickSort App", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("\n\t---------------------------------");
		System.out.println("\tOE6: QUICKSORT IMPLEMENTATION");
		System.out.println("\t---------------------------------");

		//user input for array size
		int size = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you like to sort?", "QuickSort App", JOptionPane.QUESTION_MESSAGE));
		System.out.println("\tArray size: " + size);
		int arr[] = new int[size];

		//user input for array values
		for (int x = 0; x < size; x++) {
		    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value [" + (x + 1) + "]: ", "QuickSort App", JOptionPane.QUESTION_MESSAGE));
		    System.out.println("\tArray value [" + (x + 1) + "]: " + value);
		    arr[x] = value;
		}

		//displays unsorted array
		String unsorted = Arrays.toString(arr);
		System.out.print("\n\tUnsorted array: ");
		System.out.print(unsorted);

		//displays sorted array by calling quickSort
		Manalo_OE6.quickSort(arr, 0, size - 1);
		String sorted = Arrays.toString(arr);
		System.out.print("\n\tSorted array: ");
		System.out.println(sorted);
		JOptionPane.showMessageDialog(null, "Unsorted values: " + unsorted
			+ "\nSorted values: " + sorted, "Result", JOptionPane.INFORMATION_MESSAGE);

		//exit panel
		int exit = JOptionPane.showConfirmDialog(null, "Do you like to continue?", "Exit Program", JOptionPane.YES_NO_OPTION);
		if (exit == JOptionPane.YES_OPTION) {
		    Manalo_OE6.main(args);
		} else if (exit == JOptionPane.NO_OPTION) {
		    JOptionPane.showMessageDialog(null,"Thank you for using this app!", "Exit Program",JOptionPane.INFORMATION_MESSAGE);
		    System.exit(0);
		}else{
		    return;
		}
	}
	
	//partition method
	static int partition(int array[], int left, int right) {
		//pivot value
		int pivot = array[right];

		//pointer to the right most value
		int xPtr = (left - 1);

		for (int i = left; i < right; i++) {
		    if (array[i] <= pivot) {
			xPtr++;
			swap(array, xPtr, i);
		    }
		}
		//swap the pivot element specified by xPtr
		swap(array, xPtr + 1, right);

		return (xPtr + 1);
    	}
    
    	//swap method
    	static void swap(int array[], int num1, int num2) {
		int temp = array[num1];
		array[num1] = array[num2];
		array[num2] = temp;
	}

	//quickSort method
	static void quickSort(int array[], int left, int right) {
		if (left < right) {
		    //find the pivot element smaller or greater than the original pivot
		    int pi = partition(array, left, right);

		    //recursive call for left partition
		    quickSort(array, left, pi - 1);

		    //recursive call for right partition
		    quickSort(array, pi + 1, right);
		}
	}
}
