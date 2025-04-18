package com.example.demo.LL;

public class IterateALL {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next=new Node(1);
		node.next.next=new Node(2);
		node.next.next.next = new Node(3);
//		iterateANode(node);
		Node curr = insertANodeInLast(node,4);
		iterateANode(curr);
	}
	static void iterateANode(Node node) {
		while(node!=null) {
			System.out.println("Node: "+node.data);
			node=node.next;
		}
	}
	static Node insertANodeInLast(Node head, int numb) {
		Node curr = head;
		while(curr!=null) {
			if(curr.next==null) {
				curr.next=new Node(numb);
				return head;
			}
			curr=curr.next;
		}
		return head;
	}
}
