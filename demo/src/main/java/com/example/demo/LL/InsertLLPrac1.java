package com.example.demo.LL;

public class InsertLLPrac1 {

	public static void main(String[] args) {
		Node node = new Node(2);
		node.next = new Node(3);
		node=insertNodeFirst(node, 1);
		printLL(node);
	}
	static Node insertNodeFirst(Node data, int data1) {
		Node node = new Node(data1);
		node.next=data;
		return node;
	}
	static void printLL(Node data) {
		Node temp =data;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

