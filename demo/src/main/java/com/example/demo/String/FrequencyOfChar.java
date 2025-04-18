package com.example.demo.String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String str = "pratap";
		char[] str1 = str.toCharArray();
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for(char c: str1) {
			frequency.put(c, frequency.getOrDefault(c, 0)+1);
		}
		System.out.println(frequency);
	}
}
