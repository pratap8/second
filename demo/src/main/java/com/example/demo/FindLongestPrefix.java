package com.example.demo;

import java.util.Arrays;

public class FindLongestPrefix {

	public static void main(String[] args) {
		String[] strs= {"geeksforgeeks", "geeks", "geek", "geezer"};

		StringBuilder builder = new StringBuilder();
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		for(int i=0;i<strs[0].length();i++) {
				if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
					builder.append(strs[i].charAt(i));
				}
			}
		System.out.println(builder.toString());
	}
}
