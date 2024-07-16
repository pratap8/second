package com.example.demo;

import java.util.LinkedList;

public class Reverse_linkedlist {
	static Node head;
	 public static void main(String[] args)
	    {
	        LinkedList list = new LinkedList();
//	        list.head = new Node(85);
//	        list.head.next = new Node(15);
//	        list.head.next.next = new Node(4);
//	        list.head.next.next.next = new Node(20);
//
//	        System.out.println("Given linked list");
//	        list.printList(head);
//	        head = list.reverse(head);
//	        System.out.println("");
//	        System.out.println("Reversed linked list ");
//	        list.printList(head);
	    }
}

class SolLL{
	
}

class Node {

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}