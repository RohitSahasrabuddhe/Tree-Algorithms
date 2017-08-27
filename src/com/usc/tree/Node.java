package com.usc.tree;

public class Node {
	
	int data;
	Node leftNode;
	Node rightNode;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.leftNode = null;
		this.data = data;
		this.rightNode = null;
	}

	public int getData(){
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getLeftNode(){
		return this.leftNode;
	}
	
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	
	public Node getRightNode(){
		return this.rightNode;
	}
	
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

}
