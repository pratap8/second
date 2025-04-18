package com.example.demo.LL;

public class RemoveDuplicateOccuranceInSorted {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(1);
		node.next.next.next = new Node(1);
		node.next.next.next.next = new Node(1);
		node.next.next.next.next.next = new Node(1);
		node.next.next.next.next.next.next = new Node(2);
		Node distinct = getDistinct(node);
		print(distinct);
	}
	static Node getDistinct(Node head) {
		if(head==null) {
			return head;
		}
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
		return head;
	}
	static void print(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
