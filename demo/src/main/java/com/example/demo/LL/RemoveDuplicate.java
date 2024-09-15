package com.example.demo.LL;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Node node = new Node(0);
		node.next = new Node(1);
		node.next.next = new Node(1);
		node.next.next.next = new Node(1);
		node.next.next.next.next = new Node(1);
		node.next.next.next.next.next = new Node(1);
		node.next.next.next.next.next.next = new Node(2);
		node = simpleLL(node);
		printLL(node);
	}
	 static Node simpleLL(Node head) {
		 if (head == null) {
	            return head;
	        }

	        Node current = head;
	        while (current.next != null) {
	            if (current.data == current.next.data) {
	                current.next = current.next.next;
	            } else {
	                current = current.next;
	            }
	        }
	        return head;
	    }
	 static void printLL(Node head) {
			while(head!=null) {
				System.out.println(head.data);
				head=head.next;
			}
		}
}
