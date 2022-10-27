/**
 * 	Name: Leah G. Manalo | BSIT 2-1
 * 	OE5:  Recursion implementation in Towers of Hanoi and Fibonacci Series in Java.
 */
package com.dsa.datastructurealgorithm;

import java.util.Scanner;

public class Manalo_OE5 {
	public static void towerHanoi(int disk, int src, int aux, int dst) {
		if(disk==1) {
			System.out.println("\t    Move " + src + " -> " + dst + ";");
		}else {
			towerHanoi(disk-1,src,dst,aux);
			System.out.println("\t    Move " + src + " -> " + dst + ";");
			towerHanoi(disk-1,aux,src,dst);
		}
	}
	
	public static int fibSeq(int seq) {
		if(seq == 0) {
			return 0;
		}else if (seq == 1){
			return 1;
		}else {
			return (fibSeq(seq-1) + fibSeq(seq-2));
		}
	}

	public static void main(String[] args) {
		do {
			System.out.println("\n\t-----------------------------");
			System.out.println("\tOE5: RECURSION IMPLEMENTATION");
			System.out.println("\t-----------------------------");
			System.out.println("\n\t    1. Towers of Hanoi");
			System.out.println("\t    2. Fibonacci Sequence");
			System.out.println("\t    3. Exit Program");
			System.out.print("\n\tEnter your choice: ");
			Scanner sn = new Scanner(System.in);
			int ch = sn.nextInt();
			switch(ch) {
				case 1:
					System.out.print("\n\tYou have chosen Towers of Hanoi!");
					System.out.print("\n\tEnter number of disk/s: ");
					int dsk = sn.nextInt();
					if(dsk==0) {
						System.out.println("\tThe Towers are empty. Insert a disk!");
					}else {
					System.out.println("\tSteps to complete Towers of Hanoi with " + dsk + " disk/s "
										+ "\n\tstarting from Tower 1 going to Tower 3:" );
					towerHanoi(dsk,1,2,3);
					}
					break;
				case 2:
					System.out.print("\n\tYou have chosen Fibonacci Sequence!");
					System.out.print("\n\tEnter number of element/s: ");
					int seq = sn.nextInt();
					System.out.print("\tFibonacci Sequence: ");
					for (int i=0; i<seq; i++) {
						System.out.print(fibSeq(i) + " ");
					}
					System.out.println();
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
