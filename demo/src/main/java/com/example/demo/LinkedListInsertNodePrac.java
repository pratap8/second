package com.example.demo;

import java.util.LinkedList;

public class LinkedListInsertNodePrac {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.addFirst("Phool");
		ll.add("Babu");
		ll.add("Raj");
		ll.add("Pratap");
		ll.add("Singh");
		System.out.println(ll);
		System.out.println(ll.removeIf(x->x.contains("Raj")));
		System.out.println(ll);
	}
}
class SolutionLL {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    	System.out.println(head);
    	
		return head;
        
    }
   
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {
	    	  
	      }
	      ListNode(int val) {
	    	  this.val = val; 
	    	  }
	      ListNode(int val, ListNode next) {
	    	  this.val = val;
	    	  this.next = next; 
	    	  }
	      
 }