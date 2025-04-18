package com.example.demo.Tree;

import java.util.ArrayList;
import java.util.List;

public class BTree {

	Node root;
	
	BTree(){
		root=null;
	}
	public static void main(String[] args) {
		BTree  bTree = new BTree();
		int[] treeNumb = {10,5,15,3,7,13,18,1,6};
		for(int aa:treeNumb) {
			bTree.insertVal(aa);
		}
//		bTree.print();
		bTree.sumOfNumb(6,10);
	}
	
	void sumOfNumb(int low, int high) {
		int ter=sumOfNumbA(root,low,high);
		System.out.println(ter);
	}
	static int temp=0;
	int sumOfNumbA(Node root,int low,int high) {
		if(root!=null) {
			sumOfNumbA(root.left,low,high);
			if(root.key>=low && root.key<=high) {
				temp+=root.key;
			}
			sumOfNumbA(root.right,low, high);
		}
		return temp;
	}
	void insertVal(int key) {
		root=insertedVal(root,key);
	}
	
	Node insertedVal(Node root, int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key<root.key) {
			root.left=insertedVal(root.left, key);
		}
		if(key>root.key) {
			root.right=insertedVal(root.right, key);
		}
		return root;
	}
	void print() {
		printTree(root);
	}
	void printTree(Node root) {
		if(root!=null) {
			printTree(root.left);
			System.out.println(root.key);
			printTree(root.right);
		}
	}
}