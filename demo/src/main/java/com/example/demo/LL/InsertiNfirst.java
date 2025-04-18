package com.example.demo.LL;

public class InsertiNfirst {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		Node normal=printLL(node,0);
		printNode(normal);
	}
	static Node printLL(Node node,int head) {
		Node node2 = new Node(head);
		node2.next=node;
		node2.data=head;
		return node2;
	}
	static void printNode(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}