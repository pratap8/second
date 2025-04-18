package com.example.demo.LL;

public class Find_Kth_Node_Data {

	public static void main(String[] args) {
		Node node = new Node(23);
		node.next=new Node(34);
		node.next.next=new Node(24);
		node.next.next.next=new Node(54);
		node.next.next.next.next= new Node(25);
//		System.out.println(getKthData(node, 3));
		System.out.println(getRecursive(node,3));
	}
	static int getKthData(Node node, int numb) {
		int i=0;
		while(node!=null && i<numb) {
			if(i+1==numb) {
				return node.data;
			}
			node=node.next;
			i++;
		}
		return -1;
	}
	static int getRecursive(Node node,int numb) {
		if(numb==1) {
			return node.data;
		}
		return getRecursive(node.next, numb-1);
	}
}
