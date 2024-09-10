package com.example.demo.LL;

public class SimpleLL {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node = simpleLL(node);
		printLL(node);
	}
	static Node simpleLL(Node head) {
		Node curr=head,
		temp=head;
		while(curr!=null) {
			if(curr.next.next==null) {
				break;
			}
			curr=curr.next;
		}
		return temp;
	}
	static void printLL(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
