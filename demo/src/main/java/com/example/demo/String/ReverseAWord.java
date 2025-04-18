package com.example.demo.String;

public class ReverseAWord {

	public static void main(String[] args) {
		String a="Pratap";
		printReverse(a);
	}
	static void printReverse(String a) {
		StringBuffer reverse = new StringBuffer();
		for(int i=a.length()-1;i>=0;i--) {
			reverse.append(a.charAt(i));
		}
		System.out.println(reverse.toString().toLowerCase());
	}
}
