/**
 * 	Name: Leah G. Manalo
 * 	PT4: Binary Tree implementation in Java. Following the menu selection below.

		[1] In-order Traversal
		[2] Pre-order Traversal
		[3] Post-order Traversal
			
		Select option:
 */
//package com.dsa.datastructurealgorithm;
import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class Manalo_PT4 {
	public static void main(String[] args) {
		Node staticData = staticData();
		Scanner choice = new Scanner(System.in);
		do {
			//Code block that displays the Main Menu of the program.
			System.out.println("\n\t---------------------------------");
			System.out.println("\tPT4: BINARY TREE IMPLEMENTATION");
			System.out.println("\t---------------------------------");
			System.out.println("\t[1] Inorder Traversal");
			System.out.println("\t[2] Preorder Traversal");
			System.out.println("\t[3] Postorder Traversal");
			System.out.println("\t[0] Exit Program");
			System.out.print("\n\tEnter your choice: ");
			int mainMenu = choice.nextInt();
			switch(mainMenu) {
				case 1:
					do {
						System.out.println("\n\tInorder Traversal");
						System.out.println("\tChoose the type of data:");
						System.out.println("\t[1] Static Input");
						System.out.println("\t[2] User Input");
						System.out.println("\t[0] Back to Main Menu");
						System.out.print("\n\tEnter your choice: ");
						int secMenu = choice.nextInt();
						switch(secMenu) {
						case 1:
							System.out.println("\n\tInorder Traversal with Static Data");
							System.out.print("\tResult: ");
					        	inOrder(staticData);
					        	System.out.println();
							break;
                        			case 2:
							System.out.println("\n\tInorder Traversal with User Data");
							Node inputData = inputData();
							System.out.print("\tResult: ");
							inOrder(inputData);
							System.out.println();
							break;
						case 0:
							main(null);
							break;
						default:
							System.out.println("\n\tInvalid input...please try again!");
						}
					}while(true);
				case 2:
					do {
						System.out.println("\n\tPreorder Traversal");
						System.out.println("\tChoose the type of data:");
						System.out.println("\t[1] Static Input");
						System.out.println("\t[2] User Input");
						System.out.println("\t[0] Back to Main Menu");
						System.out.print("\n\tEnter your choice: ");
						int secMenu = choice.nextInt();
						switch(secMenu) {
						case 1:
							System.out.println("\n\tPreorder Traversal with Static Data");
							System.out.print("\tResult: ");
					        	preOrder(staticData);
					        	System.out.println();
							break;
						case 2:
						    	System.out.println("\n\tPreorder Traversal with User Data");
						    	Node inputData = inputData();
						    	System.out.print("\tResult: ");
							preOrder(inputData);
							System.out.println();
							break;
						case 0:
							main(null);
							break;
						default:
							System.out.println("\n\tInvalid input...please try again!");
						}
					}while(true);
				case 3:
					do {
						System.out.println("\n\tPostorder Traversal");
						System.out.println("\tChoose the type of data:");
						System.out.println("\t[1] Static Input");
						System.out.println("\t[2] User Input");
						System.out.println("\t[0] Back to Main Menu");
						System.out.print("\n\tEnter your choice: ");
						int secMenu = choice.nextInt();
						switch(secMenu) {
						case 1:
							System.out.println("\n\tPostorder Traversal with Static Data");
							System.out.print("\tResult: ");
					        	postOrder(staticData);
					        	System.out.println();
							break;
						case 2:
						    	System.out.println("\n\tPostorder Traversal with User Data");
						    	Node inputData = inputData();
						    	System.out.print("\tResult: ");
							postOrder(inputData);
							System.out.println();
							break;
						case 0:
							main(null);
							break;
						default:
							System.out.println("\n\tInvalid input...please try again!");
						}
					}while(true);
				case 0:
					System.out.println("\n\tThank you for using this program.");
					System.exit(0);
				default:
					System.out.println("\n\tInvalid input...please try again!");
			}
		}while(true);
	}//--end of main--
	
	//preorder traversal of data
	public static void preOrder(Node node) {
		if (node == null)
		    return;
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
    	}
    
	//inorder traversal of data
    	public static void inOrder(Node node) {
		if (node == null)
		    return;
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
    	}
    
	//postorder traversal of data
    	public static void postOrder(Node node) {
		if (node == null)
		    return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
    	}
    
    	//create a list of static data
    	public static Node staticData() {
		Node a = new Node(4);
		Node b = new Node(2);
		Node c = new Node(6);
		Node d = new Node(1);
		Node e = new Node(3);
		Node f = new Node(5);
		Node g = new Node(7);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		return a;
    	}
    
    	//prompt the user for data input
    	public static Node inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("\tEnter the value of the root node: ");
		int rootValue = input.nextInt();
		System.out.print("\tEnter the value of the left child: ");
		int leftValue = input.nextInt();
		System.out.print("\tEnter the value of the right child: ");
		int rightValue = input.nextInt();
		System.out.print("\tEnter the value of the left.left child: ");
		int leftleftValue = input.nextInt();
		System.out.print("\tEnter the value of the left.right child: ");
		int leftrightValue = input.nextInt();
		System.out.print("\tEnter the value of the right.left child: ");
		int rightleftValue = input.nextInt();
		System.out.print("\tEnter the value of the right.right child: ");
		int rightrightValue = input.nextInt();

		Node a = new Node(rootValue);
		Node b = new Node(leftValue);
		Node c = new Node(rightValue);
		Node d = new Node(leftleftValue);
		Node e = new Node(leftrightValue);
		Node f = new Node(rightleftValue);
		Node g = new Node(rightrightValue);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		return a;
    	}
}

