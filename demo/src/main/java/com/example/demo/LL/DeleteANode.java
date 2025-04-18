package com.example.demo.LL;

public class DeleteANode {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		Node normal=printLL(node,2);
		printNode(normal);
	}
	static Node printLL(Node head,int remove) {
		Node temp=head;
		while(temp.next!=null) {
			if(temp.next.data==remove) {
				temp.next=temp.next.next;
				break;
			}
		}
		return head;
	}
	static void printNode(Node normal) {
		while(normal!=null) {
			System.out.println(normal.data);
			normal=normal.next;
		}
	}
}
