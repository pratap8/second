package com.example.demo.String;

public class Palindrome_String {

	public static void main(String[] args) {
		String a="123211";
		int x=0;
		for(int i=0,j=a.length()-1;i<a.length()/2;i++,j--) {
			if(a.charAt(i)==a.charAt(j)) {
				continue;
			}else {
				x++;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(x==0) {
			System.out.println("Palindrome");
		}
	}
}
