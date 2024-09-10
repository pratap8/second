package com.example.demo.LL;

public class Reverse_A_LL {
	public static void main(String[] args) {
		Node data = new Node(2);
		data.next = new Node(3);
		data.next.next = new  Node(4);
		
		data=nodeInsertFirst(data,1);
		Reverse_A_LL.nodePrint(data);
	}
	static void nodePrint(Node data) {
		
		Node temp=data;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	static Node nodeInsertFirst(Node data,int data1) {
		Node node = new Node(data1);
		node.next=data;
		return node;
		
	}
}

class ReverseLL{
	public void push(int data) {
		Node node = new Node(data);
		
	}
}

class Node{
	int data;
	Node next;
	
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}