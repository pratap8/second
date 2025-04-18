package com.example.leetcode;

public class Removing_Stars_From_a_String_2390 {

	public static void main(String[] args) {
		String s = "leet**cod*e";
		 char[] word = s.toCharArray();
	        int count=0;
	        for(int i=word.length-1;i>=0;i--){
	            if(word[i]=='*'){
	                count++;
	            }
	            if(word[i]!='*' && count!=0){
	                word[i]='0';
	                count--;
	            }
	        }
	        StringBuffer buffer = new StringBuffer();
	        for(char letter:word){
	            if(letter!='0' && letter!='*'){
	                buffer.append(letter);
	            }
	        }
	        System.out.println(buffer.toString());
	}
}
