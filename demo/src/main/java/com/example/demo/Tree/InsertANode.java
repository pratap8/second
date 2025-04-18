package com.example.demo.Tree;

public class InsertANode {
	
	static Node root;
	public InsertANode() {
		root=null;
	}
	
	public static void main(String[] args) {
//		Node root = new Node(10);
//        root.left = new Node(11);
//        root.right = new Node(9);
//        root.left.left = new Node(7);
//        root.right.left = new Node(15);
//        root.right.right = new Node(8);
//        int key = 12;
//        root = InsertNode(root, key);
		insert(50);
		insert(60);
		insert(90);
		insert(30);
		insert(100);
		insert(80);
		insert(100);
		insert(60);
//        InsertANode.deleteNode(60);
        InsertANode.print(root);        
	}
	static void deleteNode(int key) {
		deleteANode(root,key);
	}
	static Node deleteANode(Node root, int key) {
		if(root==null) {
			return root;
		}
//		if(root.left.key==key) {
//			root.left.key=root.left.left.key;
//			return root.left;
//		}
//		if(root.right.key==key) {
//			root.right.key=root.right.right.key;
//			return root.right;
//		}
		if(root.key==key) {
			return root;
		}
		if(key<root.key) {
			root.left=deleteANode(root.left, key);
		}
		if(key>root.key) {
			root.right=deleteANode(root.right, key);
		}
		return root;
	}
	static Node InsertNode(Node root,int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key < root.key) {
			root.left=InsertNode(root.left, key);
		}
		if(key>root.key) {
			root.right = InsertNode(root.right, key);
		}
		return root;
	}
	static void insert(int val) {
		root=InsertVal(root, val);
	}
	static Node InsertVal(Node root,int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key < root.key) {
			root.left=InsertNode(root.left, key);
		}
		if(key>root.key) {
			root.right = InsertNode(root.right, key);
		}
		return root;
	}
	static void print(Node root){
//		System.out.println(root);
		InsertANode.printANode(root);
	}
	static void printANode(Node root) {
		if(root!=null) {
			printANode(root.left);
			System.out.println(root.key);
			printANode(root.right);
		}
	}
}
