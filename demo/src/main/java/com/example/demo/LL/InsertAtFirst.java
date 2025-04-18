package com.example.demo.LL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InsertAtFirst {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		Node nodePrint = getNodes(node,1);
//		insertNodeInMiddle(nodePrint,1);
//		printNode(nodePrint);
//		printNode(deleteAtFirst(nodePrint));
//		printNode(deleteMiddleNode(nodePrint));
//		printNode(deleteLastNode(nodePrint));
//		printNode(reverseNode(nodePrint));
//		pairSwap(nodePrint);
//		removeDuplicate(nodePrint);
		removeDuplicate(nodePrint);
		printNode(nodePrint);
	}
	static Node getNodes(Node node, int numb) {
		Node curr = new Node(numb);
		curr.next=node;
		return curr;
	}
	static void printNode(Node node) {
		while(node!=null) {
			System.out.print("Node: "+node.data);
			System.out.println();
			node=node.next;
		}
	}
	static void insertNodeInMiddle(Node node,int numb) {
		Node size=node;
		Node curr = node;
		Node node2 = new Node(numb);
		int nodeSIze=0;
		while(size!=null) {
			size=size.next;
			nodeSIze++;
		}
		nodeSIze=nodeSIze/2;
		while(nodeSIze-->1) {
			curr=curr.next;
		}
		node2.next=curr.next;
		curr.next=node2;
		printNode(node);
	}
	static Node deleteAtFirst(Node node) {
		return node.next;
	}
	static Node deleteMiddleNode(Node node) {
		Node curr=node;
		Node temp = node;
		int i=0;
		while(temp!=null) {
			temp=temp.next;
			i++;
		}
		i=i/2;
		while(i-->1) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return node;
	}
	static Node deleteLastNode(Node node) {
		Node curr=node;
		while(curr!=null) {
			if(curr.next.next==null) {
				curr.next=null;
			}
			curr=curr.next;
		}
		return node;
	}
	static Node reverseNode(Node head) {
		Node curr=head,prev=null,next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	static void pairSwap(Node node) {
		if(node==null || node.next==null) {
			return;
		}
		int temp=node.data;
		node.data=node.next.data;
		node.next.data=temp;
		pairSwap(node.next.next);
	}
	static void removeDuplicate(Node node) {
		Node curr=node;
		Set<Integer> set = new HashSet<Integer>();
		while(curr!=null) {
			set.add(curr.data);
			curr=curr.next;
		}
		curr=node;
		int i=set.size();
		for(Integer aa:set) {
			curr.data=aa;
			if(i-->1 ) {
				curr=curr.next;
			}else {
				curr.next=null;
			}
			
		}
	}
}
