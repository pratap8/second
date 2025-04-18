package com.example.demo.Tree;

//Given a binary tree, the task is to convert the binary tree to its Mirror tree. 
//Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

public class InvertedTree {
	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        mirror(root);
	}
	static void mirror(Node root) {
		if(root==null) {
			return;
		}
		
		mirror(root.left);
		mirror(root.right);
		
		Node temp=root.left;
		root.right=root.left;
		root.left=temp;
		
	}
	
}
