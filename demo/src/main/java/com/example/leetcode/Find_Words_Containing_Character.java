package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character {

	public static void main(String[] args) {
		SolutionChar char1 = new SolutionChar();
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		System.out.println(char1.findWordsContaining(words, x));
	}
}

class SolutionChar {
    public List<Integer> findWordsContaining(String[] words, char x) {
    	String a = String.valueOf(x);
    	List<Integer> z = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(a)) {
            	z.add(i);
            }
        }
        return z;
    }
}