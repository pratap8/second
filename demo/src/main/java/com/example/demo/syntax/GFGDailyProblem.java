package com.example.demo.syntax;

public class GFGDailyProblem {

	Node root;
	public static void main(String[] args) {
		Integer[] arr = {20, 8, 22, 4, 12, null, null, null, null, 10, 14};
		GFGDailyProblem tree = new GFGDailyProblem();
		for (Integer val : arr) {
            if (val != null) { // Handle null values
            	tree.root=	tree.insert(tree.root,val); // Call the non-static method
            }
        }
    }

	Node insert(Node root,int aa) {
		if(root==null) {
			return new Node(aa);
		}
		if(aa<root.key) {
			root.left=insert(root.left, aa);
		}
		if(aa>root.key) {
			root.right=insert(root.right, aa);
		}
		return root;
	}
}

class Node{
	int key;
	Node right,left;
	Node(int key){
		this.key=key;
		left=right=null;
	}
}