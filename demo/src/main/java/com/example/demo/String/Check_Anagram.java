package com.example.demo.String;

import java.util.Arrays;

public class Check_Anagram {

	public static void main(String[] args) {
		String first="allergy",second="allergyi";
		char[] a=first.toCharArray();
		char[] b=second.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an anagram");
		}
		
	}
}
