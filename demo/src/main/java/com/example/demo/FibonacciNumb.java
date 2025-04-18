package com.example.demo;

public class FibonacciNumb {

	public static void main(String[] args) {
		System.out.println(fabNumb(5));
//		printFibonacci(5);
	}
	static int i=1,j=1;
	static int fabNumb(int nth) {
		
		if(nth>0) {
			n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;   
			fabNumb(nth--);
		}
		return n3;
	}
	 static int n1=0,n2=1,n3=0;    

	static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
}
