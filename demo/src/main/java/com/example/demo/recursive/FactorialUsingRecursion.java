package com.example.demo.recursive;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(fac(5));
	}
	static int fac(int head) {
		if(head<=1)
			return head;
		return head*fac(head-1);
	}
}
