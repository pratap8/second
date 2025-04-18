package com.example.demo.Tree;

public class OptimizedCODE {
	 private Node root1, root2;

	    public static void main(String[] args) {
	    	OptimizedCODE identical = new OptimizedCODE();
	        
	        int[] arr1 = {87,43,4,56,34,4557,34,64,7,24,57};
	        int[] arr2 = {87,43,4,56,34,4557,34,64,7,24,57};

	        for (int key : arr1) {
	            identical.root1 = identical.insert(identical.root1, key);
	        }
	        for (int key : arr2) {
	            identical.root2 = identical.insert(identical.root2, key);
	        }

	        System.out.println("Are the two trees identical? " + identical.areIdentical(identical.root1, identical.root2));
	    }

	    private Node insert(Node root, int key) {
	        if (root == null) {
	            return new Node(key);
	        }
	        if (key < root.key) {
	            root.left = insert(root.left, key);
	        } else if (key > root.key) {
	            root.right = insert(root.right, key);
	        }
	        return root;
	    }

	    private boolean areIdentical(Node root1, Node root2) {
	        if (root1 == null && root2 == null) {
	            return true;
	        }
	        if (root1 == null || root2 == null) {
	            return false;
	        }
	        return (root1.key == root2.key) &&
	               areIdentical(root1.left, root2.left) &&
	               areIdentical(root1.right, root2.right);
	    }

}
