package com.usc.tree;

import java.util.Scanner;

public class BinarySearchTree {

	public static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Binary Search Tree Implemntation");
		Scanner scan = new Scanner(System.in);
		int no;
		
		System.out.println("Enter No of elements of Binary Search tree:");
		no = scan.nextInt();
		int data;
		System.out.println("Enter "+no+" Elements:");
		for(int i = 0 ; i < no ; i ++)
		{
			data = scan.nextInt();
			if(i ==0) {
				root = new Node(data);
			}
			else {			
				addBinaryElement(root,data);
			}
			
		}
		
		//traverseBinaryTree(root);
		
		ascendingBinaryTreeTraversal(root);
		//System.out.println("  " + root.data + "  " + root.leftNode.data + "  " + root.rightNode.data);
		scan.close();
	}

	private static void ascendingBinaryTreeTraversal(Node node) {
		// TODO Auto-generated method stub
		
		
		
		if(node.leftNode != null) {
			traverseBinaryTree(node.leftNode);
		}
		System.out.print("  " + node.data + "  ");
		if(node.rightNode != null) {
			traverseBinaryTree(node.rightNode);
		}
		
			
		
	}

	private static void traverseBinaryTree(Node node) {
		// TODO Auto-generated method stub
		System.out.print("  " + node.data + "  ");
		
		if(node.leftNode != null) {
			traverseBinaryTree(node.leftNode);
		}
		if(node.rightNode != null) {
			traverseBinaryTree(node.rightNode);
		}
				
	}

	private static void addBinaryElement(Node node, int data) {
		// TODO Auto-generated method stub
		if(data <= node.data) {
			//traverse left
			if(node.leftNode == null) {
				Node newNode = new Node(data);
				node.leftNode = newNode;
			}
			else {
				addBinaryElement(node.leftNode, data);
			}
			
		}
		else {
			//traverse right
			if(node.rightNode == null) {
				Node newNode = new Node(data);
				node.rightNode = newNode;
			}
			else {
				addBinaryElement(node.rightNode, data);
			}
		}
	}



}
