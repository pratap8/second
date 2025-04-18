package com.example.demo.String;

public class ArrayPalindrome {

	public static void main(String[] args) {
		String a="qweewq";
		printPalin(a);
	}
	static void printPalin(String a) {
		int j=a.length()-1
				;
		int k=0;
		for(int i=0;i<a.length();i++,j--) {
			if(a.charAt(i)==a.charAt(j)) {
				continue;
			}else {
				k++;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(k==0) {
			System.out.println(a+ " is palindrome");
		}
	}
}
