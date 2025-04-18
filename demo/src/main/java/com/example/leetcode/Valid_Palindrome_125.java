package com.example.leetcode;

public class Valid_Palindrome_125 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}
	static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder builder = new StringBuilder(s).reverse();
        System.out.println(builder.toString());
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
