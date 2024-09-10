package com.example.demo.LL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class SortLL {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.next = new Node(8);
		node.next.next = new Node(3);
		node.next.next.next = new Node(6);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(4);
//		node = sortUsingListToLL(node);
		node = sortUsingTree(node);
		printLL(node);
	}
	static Node sortUsingListToLL(Node head) {
		Node curr=head;
		List<Integer> numb = new ArrayList<Integer>();
		while(curr!=null) {
			numb.add(curr.data);
			curr=curr.next;
		}
		int temp=-1;
		curr=head;
		for(int i=0;i<numb.size();i++) {
			for(int j=i;j<numb.size();j++) {
				if(numb.get(i)>numb.get(j)) {
					temp=numb.get(j);
					numb.set(j, numb.get(i));
					numb.set(i, temp);
				}
			}
		}
		for(int i=0;i<numb.size();i++) {
			if(i==0) {
				head.data=numb.get(i);
				curr=head;
			}else {
				curr.next=new Node(numb.get(i));
				curr=curr.next;
			}
		}
		return head;
	}
	static Node sortUsingTree(Node head) {
		TreeSet<Integer> numb = new TreeSet<Integer>();
		Node curr=head;
		while(curr!=null) {
			numb.add(curr.data);
			curr=curr.next;
		}
		System.out.println(numb);
		return head;
	}
	static void printLL(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
