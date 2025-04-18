package com.example.demo.String;

import java.util.HashMap;

public class Panagram_All_Char_Exists {
//A pangram is a sentence containing every letter in the English Alphabet.


	public static void main(String[] args) {
		String a="The quick brown fox jumps over the dog";
		char[] charArray = a.toCharArray();
		HashMap<Character, Character> c = new HashMap<Character, Character>();
		int i=0;
		while(i<charArray.length) {
			c.put(charArray[i], charArray[i]);
			i++;
		}
		if(c.size()>26) {
			System.out.println("panagram");
		}else {
			System.out.println("not");
		}
	}
}
