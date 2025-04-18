package com.example.demo.LL;

public class ReverseA_LL {

	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(2);
		node.next.next.next = new Node(3);
		node.next.next.next.next = new Node(4);
		Node reverse = reverse(node);
		print(reverse);
	}
	static void print(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
//	0->1->2->3->4      4->3->2->1->0
	static Node reverse(Node node) {
		Node curr = node,temp=node;
		Node pre=null;
		while(temp!=null) {
			temp=temp.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
		}
		return pre;
	}
}
