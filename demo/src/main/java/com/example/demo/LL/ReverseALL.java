package com.example.demo.LL;

public class ReverseALL {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node = reverseLL(node);
		printLL(node);
	}
	static Node reverseLL(Node head) {
		Node curr=head,temp = head;
		Node pre=null;
		while(temp!=null) {
			temp=temp.next;
			curr.next=pre;
			pre=curr;
			curr=temp;			
		}
		return pre;
	}
	static void printLL(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
