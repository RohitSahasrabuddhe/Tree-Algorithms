package com.usc.tree;
import java.util.Scanner;
public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary Tree Implemntation");
		Scanner scan = new Scanner(System.in);
		
		/*char choice;
		
		do {
			System.out.println("Do u want to add new element?Y/N");
			choice = scan.next().charAt(0);
			
		}while(choice == 'Y' || choice == 'y');*/
		
		Node root = new Node(20);
		
		Node firstLeft = new Node(10);
		root.leftNode = firstLeft;
		
		Node firstRight = new Node(15);
		root.rightNode = firstRight;
		
		
		System.out.println("  " + root.data + "  " + root.leftNode.data + "  " + root.rightNode.data);
		
		
		
		scan.close();
	}

}
