package com.example.demo.LL;

public class InsertDataInLast {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node = insertLastNode(node,4);
		printNode(node);
	}
	static Node insertLastNode(Node head, int data) {
		Node node = head;
		Node node2 = new Node(data);
		while(node.next !=null) {
			node = node.next;
		}
		node.next =node2; 
		return head;
	}
	static void printNode(Node head) {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}
}
