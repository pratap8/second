package com.example.demo.LL;

public class InsertInMiddle {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		node = insertMidNode(node, 3);
		printLL(node);
	}
	static Node insertMidNode(Node head, int data) {
		int a=0;
		Node node=head,curr = head;
		Node node2 = new Node(data);
		while(node!=null) {
			node=node.next;
			a++;
		}
		a=a/2;
		while(curr !=null) {
			if(a==1) {
				node2.next=curr.next;
				curr.next = node2;
			}
			curr=curr.next;
			
			a--;
		}
		
		return head;
	}
	static void printLL(Node head) {
		Node node = head;
		while(node !=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
