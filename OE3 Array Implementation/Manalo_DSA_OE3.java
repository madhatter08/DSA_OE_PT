//Name: Leah G. Manalo | BSIT 2-1
/*OE3 - Array implementation in Java programming language or any programming language.
Create an unsigned integer array that accepts input from the user. Find the highest,
lowest elements of the array, output the sum of the array and sort the array (use function or method). */

import java.util.*;

public class Manalo_DSA_OE3 {
    static void sortAscending(int size, int[] arr) {
        //Sorting array in Ascending Order
        for (int x = 0; x < size; x++) {
            for (int y = x + 1; y < size; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.print("\n\tAscending Order: ");
        for (int z = 0; z < size; z++) {
            System.out.print(arr[z] + " ");
        }
    }

    static void sortDescending(int size, int[] arr) {
        //Sorting array in Descending Order
        for (int x = 0; x < size; x++) {
            for (int y = x + 1; y < size; y++) {
                if (arr[x] < arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.print("\n\tDescending Order: ");
        for (int z = 0; z < size; z++) {
            System.out.print(arr[z] + " ");
        }
    }

    static int arraySum(int len, int[] arr) {
        //Addition of the array elements
        int sum = 0;
        for (int x = 0; x < len; x++) {
            sum = sum + arr[x];
        }
        return sum;
    }

    static void highLow(int len, int[] arr){
        //Displaying the highest and lowest array elements
        System.out.print("\nHighest and Lowest Elements of the Array\n\n");
        for (int x = 0; x < len; x++) {
            for (int y = x + 1; y < len; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.println("\tHighest Element: " + arr[len - 1]);
        System.out.println("\tLowest Element: " + arr[0]);
    }

    public static void main(String[] args) {
        
        System.out.print("\nOE3: ARRAY IMPLEMENTATION\n\n");
        System.out.print("\tEnter the array size: ");
        Scanner sn = new Scanner(System.in);
        int size = sn.nextInt();
        int arr[] = new int[size];
        int len = arr.length;

        //Prompting the user to enter array elements
        for (int x = 0; x < size; x++) {
            System.out.print("\tEnter the array values [" + (x + 1) + "]: ");
            arr[x] = sn.nextInt();
        }
        
        //Addition of the array elements with Function Call
        System.out.println("\nAddition of Array");
        System.out.print("\n\tElements of the array: ");
        for (int x = 0; x < size; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("\n\tSum: " + arraySum(len, arr));

        //Displaying the highest and lowest array element with Function Call
        highLow(len, arr);

        //Sorting array in ascending and descending order
        System.out.println("\nSorting of Array");
        sortAscending(size, arr);
        sortDescending(size, arr);
        System.out.println("\n");
    }
}