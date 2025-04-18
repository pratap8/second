package com.example.demo.LL;

public class SortAll {

	public static void main(String[] args) {
		Node node = new Node(16);
		node.next=new Node(11);
		node.next.next=new Node(15);
		node.next.next.next=new Node(12);
		node.next.next.next.next=new Node(10);
		node.next.next.next.next.next=new Node(13);
		node.next.next.next.next.next.next=new Node(60);
		
		Node sorted=sort(node);
		printSort(sorted);
	}
	static void printSort(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	static Node sort(Node node) {
		Node curr=node;
		Node curr1=node;
		int temp1=0;
		boolean first=true;
		while(curr!=null) {
			while(curr1!=null) {
				if(curr.data>curr1.data) {
					temp1=curr.data;
					curr.data=curr1.data;
					curr1.data=temp1;
				}
				curr1=curr1.next;
			}
			if(first) {
				node.data=curr.data;
				first=false;
			}
			curr=curr.next;
			curr1=curr;
		}
		
		return node;
	}
}
