package com.example.demo.LL;

public class DeleteTheOccurance {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node = deleteOccurance(node, 4);
		printOccur(node);
	}
	static Node deleteOccurance(Node head,int numb) {
		Node curr=head;
		while(curr!=null) {
			if(curr.next==null) {
				curr=curr.next;
				break;
			}
			if(curr.next.data==numb) {
				curr=curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		return head;
	}
	static void printOccur(Node head) {
		while(head !=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
