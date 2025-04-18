package com.example.demo.String;

import java.util.Arrays;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		String[] strs= {"geeksforgeeks", "geeks", "geek", "geezer"};
		if (strs == null || strs.length == 0)
            System.out.println(-1);

        // Sort the array of strings
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int i=0;
        while(i<a.length() && a.charAt(i)==b.charAt(i)) {
        	i++;
        }
        System.out.println(a.substring(0,i));
	}
}
