package com.example.stack;

import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {
		Stack<Character> aa = new Stack<Character>();
		String bb = "GeeksQuiz";
		for(int i=0;i<bb.length();i++) {
			aa.push(bb.charAt(i));
		}
		System.out.println(aa.size());
		while(!aa.isEmpty()) {
            System.out.print(aa.pop());
        }
	}
}
