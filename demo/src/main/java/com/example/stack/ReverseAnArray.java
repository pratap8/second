package com.example.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] reverse = {1,2,3,4,5,6,7,8,9};
		Stack<Integer> aa = new Stack<Integer>();
		for(int i=0;i<reverse.length;i++) {
			aa.push(reverse[i]);
		}
		int i=0;
		while(!aa.isEmpty()) {
			reverse[i]=aa.pop();
			i++;
		}
		Arrays.stream(reverse).forEach(x->System.out.print(x));
	}
}
