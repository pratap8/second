package com.example.leetcode;

import java.util.Arrays;

public class Sort_Vowels_in_a_String_2785 {

	public static void main(String[] args) {
		String s = "lEetcOde";
		char [] vowels= {'A','E','I','O','U','a','e','i','o','u'};
		StringBuilder aa = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<vowels.length;j++) {
				if(s.charAt(i)==vowels[j]) {
					aa.append(s.charAt(i));
				}
			}
		}
		char [] vowels2=aa.toString().toCharArray();
		Arrays.sort(vowels2);
		int k=0;
		StringBuilder aa1 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			boolean pass=true;
			for(int j=0;j<vowels.length;j++) {
				if(s.charAt(i)==vowels[j]) {
					aa1.append(vowels2[k++]);
					pass=false;
					break;
				}
			}
			if(pass) {
				aa1.append(s.charAt(i));
			}
		}
	}
}
