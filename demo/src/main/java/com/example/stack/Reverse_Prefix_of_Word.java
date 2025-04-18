package com.example.stack;

import java.util.Stack;

public class Reverse_Prefix_of_Word {

	public static void main(String[] args) {
		System.out.println(reversePrefix("abcd",'z'));
	}
	public static String reversePrefix(String word, char ch) {
		Stack<Character> aa = new Stack<Character>();
		int k=0;
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<word.length();i++) {
			if(ch==word.charAt(i)) {
				aa.push(word.charAt(i));
				k++;
				break;
			}else {
				aa.push(word.charAt(i));
				k++;
			}
		}
		System.out.println(k+" "+word.length());
		if(k==word.length() && ch!=word.charAt(k-1)) {
			return word;
		}
		
		while(!aa.empty()){
			builder.append(aa.pop());
		}
		while(k<word.length())
			builder.append(word.charAt(k++));
        return builder.toString();
    }
}
