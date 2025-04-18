package com.example.demo.LL;

public class RotateLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node data = rotate(head);
		print(data);
	}
	static Node rotate(Node head) {
		 // Initialize three pointers: curr, prev and next
        Node curr = head, prev = null, next;

        // Traverse all the nodes of Linked List
        while (curr != null) {
            
            // Store next
            next = curr.next;
            
            // Reverse current node's next pointer
            curr.next = prev;
            
            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }
        
        // Return the head of reversed linked list
        return prev;
	}
	static void print(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
