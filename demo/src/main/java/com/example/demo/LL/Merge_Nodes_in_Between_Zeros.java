package com.example.demo.LL;

public class Merge_Nodes_in_Between_Zeros {
	
	public static void main(String[] args) {
		Node data = new Node(0);
		data.next = new Node(3);
		data.next.next = new  Node(1);
		data.next.next.next = new  Node(0);
		data.next.next.next.next = new  Node(4);
		data.next.next.next.next.next = new  Node(5);
		data.next.next.next.next.next.next = new  Node(2);
		data.next.next.next.next.next.next.next = new  Node(0);
		
		data=mergeNodes(data);
		nodePrint(data);
	}
	public static Node mergeNodes(Node head ) {
        Node node =new Node(0);
        Node node1=node;
        int i=0;
        while(head !=null){
           if(head.data!=0) {
        	  i+=head.data;
        	  head=head.next;
        	 
           }else if(head.data==0 && i!=0){
        	   node1.next=new Node(i);
        	   head=head.next;
        	   node1=node1.next;
        	   i=0;
           }else {
        	   head=head.next;
           }
        }
        return node.next;
    }
static void nodePrint(Node data) {
		
		Node temp=data;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
