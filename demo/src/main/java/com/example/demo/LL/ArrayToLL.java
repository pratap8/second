package com.example.demo.LL;

public class ArrayToLL {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		Node node =null;
		node=convertLL(a);
		printLL(node);
	}
	static Node convertLL(int[] numb) {
		Node head = new Node(-1);
		Node curr=new Node(0);
		int a = numb.length;
		for(int i=0;i<a;i++) {
			if(head.data==-1) {
				head.data=numb[i];
				curr=head;
			}else {
				curr.next=new Node(numb[i]);
				curr=curr.next;
			}
		}
		return head;
	}
	static void printLL(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
