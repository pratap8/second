package com.example.demo.String;

public class ReverseAString {

	public static void main(String[] args) {
		
		String a= "i.like.this.program.very.much";
		a.toCharArray();
		StringBuilder c = new StringBuilder();
		for(int i=a.length()-1;i>=0;i--) {
			c.append(a.charAt(i));
		}
		System.out.println(c);
	}
}
