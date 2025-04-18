package com.example.demo.Tree;

public class BTPrac {

	Node root;
	
	
	public static void main(String[] args) {
		BTPrac btPrac = new  BTPrac();
		btPrac.insertNode(90);
		btPrac.insertNode(80);
		btPrac.insertNode(100);
		btPrac.insertNode(60);
		btPrac.insertNode(120);
		btPrac.insertNode(85);
		btPrac.insertNode(95);
//		btPrac.printl();
//		btPrac.findMin();
		btPrac.findMax();
	}
	void insertNode(int key) {
		root=insertPrac(root,key);
	}
	Node insertPrac(Node root,int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key<root.key) {
			root.left=insertPrac(root.left, key);
		}
		if(key>root.key) {
			root.right=insertPrac(root.right, key);
		}
		return root;
		
	}
	void printl() {
		printNode(root);
	}
	void printNode(Node root) {
		if(root!=null) {
			printNode(root.left);
			System.out.println(root.key);
			printNode(root.right);
		}
	}
	void findMin() {
		System.out.println(findRec(root));
	}
	int findRec(Node root) {
		if(root==null) {
			throw new IllegalStateException("Tree null");
		}
		if(root.left==null) {
			return root.key;
		}
		return findRec(root.left);
	}
	void findMax(){
		System.out.println(findNodeMax(root));
	}
	int findNodeMax(Node root) {
		if(root==null) {
			throw new IllegalStateException("Tree null");
		}
		if(root.right==null) {
			return root.key;
		}
		return findNodeMax(root.right);
	}
}

class Node{
	int key;
	Node right,left;
	
	Node(int key){
		this.key=key;
		right=left=null;
	}
}