package com.example.demo.String;

import java.util.Arrays;
import java.util.Collections;

public class Longest_Comm_Prefix {

	public static void main(String[] args) {
		String[] strs= {"geeksforgeeks", "geeks", "geek", "geezer"};
		Arrays.sort(strs);
		int temp=0;
		while(temp<strs[0].length() && strs[0].charAt(temp)==strs[strs.length-1].charAt(temp)) {
			temp++;
		}
		System.out.println(strs[0].substring(0, temp));
	}
}
