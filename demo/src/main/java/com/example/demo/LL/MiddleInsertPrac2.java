package com.example.demo.LL;

public class MiddleInsertPrac2 {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node = middleLL(node, 2);
		printNode(node);
	}
	static Node middleLL(Node head, int data) {
		Node node = new Node(data);
		Node curr = head;
		int a=0;
		while(curr!=null) {
			curr=curr.next;
			a++;
		}
		a=a/2;
		curr=head;
		while(a-->1) {
			curr=curr.next;
		}
		node.next=curr.next;
		curr.next=node;
		
		return head;
	}
	static void printNode(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
