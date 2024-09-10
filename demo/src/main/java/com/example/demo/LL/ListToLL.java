package com.example.demo.LL;

import java.util.ArrayList;
import java.util.List;

public class ListToLL {

	public static void main(String[] args) {
		List<Integer> numb = new ArrayList<Integer>();
		numb.add(1);
		numb.add(2);
		numb.add(3);
		numb.add(4);
		Node node = null;
		node=listToLL(numb);
		printLL(node);
	}
	static Node listToLL(List numb) {
		Node head = new Node(-1);
		Node curr=head;
		int a=numb.size();
		for(int i=0;i<a;i++) {
			if(head.data==-1) {
				head.data=(int) numb.get(i);
				curr=head;
			}else {
				curr.next=new Node((int)numb.get(i));
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
