package com.example.demo.LL;

public class ReverseLL_Prac2 {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next=new Node(1);
		node.next.next = new Node(2);
		node.next.next.next = new Node(3);
		print(node);
		Node head = getReverse(node);
		print(head);
	}
	static Node getReverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node nex = null;
		
		while(curr!=null) {
			nex=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nex;
		}
		return prev;
	}
	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
}
