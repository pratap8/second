package com.example.leetcode;

public class Score_of_a_String {

	
	public static void main(String[] args) {
		risk a_String = new risk();
		System.out.println(a_String.scoreOfString("hello")+".....................");
		
		}
	
}

class risk{
	public int scoreOfString(String s) {
        int a=s.length();
        int b=0;
        int c=0;
        System.out.println(s.charAt(0) - '0');
        for(int i=0;i<a-1;i++) {
        	b=s.charAt(i)-s.charAt(i+1);
        	c=c+Math.abs(b);
        	System.out.println(c);        	
        }
        return c;
    }
}