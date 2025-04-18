package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Sort_Characters_By_Frequency_451 {

	public static void main(String[] args) {
		SortChar char1 = new SortChar();
		System.out.println(char1.frequencySort("tree"));
	}
}
class SortChar {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++) {
        	freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        return "will";
    }
}