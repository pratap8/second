package com.example.demo.LL;

public class PrintMiddleLL {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		printMiddleLL(node);
	}
	static void printMiddleLL(Node head) {
		int a=0;
		Node curr = head;
		while(curr!=null) {
			curr=curr.next;
			a++;
		}
		curr=head;
		a=a/2;
		while(a-->0) {
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
}
