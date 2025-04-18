package com.example.leetcode;

public class Reverse_Words_in_a_String_151 {
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverseWords("  hello world  "));
	}
}
class Reverse {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder original = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].equals(" ") && !str[i].isEmpty()) {
            	original.append(" "+str[i]);
            }
        }
        return original.toString().trim();
    }
}