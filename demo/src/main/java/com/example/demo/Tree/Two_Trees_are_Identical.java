package com.example.demo.Tree;


//Given two binary trees, the task is to find if both of them are identical or not.
//Two trees are identical when they have the same data and the arrangement of data is also the same.
public class Two_Trees_are_Identical {

	Node root, root1;
	public static void main(String[] args) {
		Two_Trees_are_Identical identical = new Two_Trees_are_Identical();
		int[] arr = {87,43,4,57,34,4557,34,64,7,24,57};
		int[] arr1 = {87,43,4,56,34,4557,34,64,7,24,57};
		for(int first:arr) {
			identical.insertVal(first);
		}
		for(int second: arr1) {
			identical.insertVal1(second);
		}
//		identical.printTree();
		identical.findIdentical();
	}
	void printTree() {
		printTree(root);
		System.out.println("------------");
		printTree(root1);
	}
	void printTree(Node root) {
		if(root!=null) {
			printTree(root.left);
			System.out.println(root.key);
			printTree(root.right);
		}
	}
	void findIdentical() {
		System.out.println(getAnswer(root,root1));
	}
	
	void insertVal(int key) {
		root=insertVal(root,key);
	}
	void insertVal1(int key) {
		root1=insertVal(root1, key);
	}
	Node insertVal(Node root,int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key<root.key) {
			root.left=insertVal(root.left, key);
		}
		if(key>root.key) {
			root.right=insertVal(root.right, key);
		}
		return root;
	}
	boolean getAnswer(Node root, Node root1) {
		if(root!=null ||root1!=null) {
			System.out.println(root.key+" "+root1.key);
		}
		if(root==null && root1==null) {
			return true;
		}
		
		if(root==null || root1==null) {
			return false;
		}
			return (root.key==root1.key) 
					&& getAnswer(root.left, root1.left) 
					&& getAnswer(root.right, root1.right)
					;
		
	}
}
