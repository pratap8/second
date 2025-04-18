package com.example.demo.LL;

public class Removve_Duplicate_From_Sorted_LL {

	public static void main(String[] args) {
		Node node = new Node(11);
		node.next=new Node(11);
		node.next.next=new Node(11);
		node.next.next.next=new Node(12);
		node.next.next.next.next=new Node(12);
		node.next.next.next.next.next=new Node(13);
		node.next.next.next.next.next.next=new Node(60);
		getNonDuplicate(node);
		printList(node);
		
	}
	static void getNonDuplicate(Node head) {
		if(head==null) {
			return ;
		}
		if(head.next!=null) {
			if(head.data==head.next.data) {
				head.next=head.next.next;
				getNonDuplicate(head);
			}
			else {
				getNonDuplicate(head.next);
			}
		}
	}
	static void printList(Node list) {
		while(list!=null) {
			System.out.println(list.data);
			list=list.next;
		}
	}
}
