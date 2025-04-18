package com.example.stack;

import java.util.Stack;

public class StackPrac {

	public static void main(String[] args) {
//		StringBuilder a =  new StringBuilder("Phoolbabu");
//		reverseString(a);
//		System.out.println(a);
		System.out.println(reverseStringA("Phoolbabu"));
	}
	static void reverseString(StringBuilder a) {
		Stack<Character> b = new Stack<>();
		for(int i=0;i<a.length();i++) {
			b.push(a.charAt(i));
		}
		a.delete(0, a.length());
		while(!b.isEmpty()) {
			a.append(b.peek());
			b.pop();
		}
	}
	static void reverseStr(StringBuilder a) {
		System.out.println(a.reverse());
	}
	static String reverseStringA(String a) {
		String b="";
		a.intern();
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i)+" "+i);
			b=b+a.charAt(i);
		}
		return b;
	}
}
