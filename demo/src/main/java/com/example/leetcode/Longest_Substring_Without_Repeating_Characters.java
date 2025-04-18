package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		List<HashMap<Character, Character>> val = new ArrayList<HashMap<Character,Character>>();
		String s = "pwwkew";
		for(int i=0;i<s.length();i++) {
			HashMap<Character, Character> alpha = new LinkedHashMap<Character, Character>();
			alpha.put(s.charAt(i), s.charAt(i));
			for(int j=i+1;j<s.length();j++) {
				if(alpha.containsKey(s.charAt(j))) {
					break;
				}else {
					alpha.put(s.charAt(j), s.charAt(j));
				}
			}
			val.add(alpha);
		}
		System.out.println(val);
		int count=0;
		int numb=0;
		for(int i=0;i<val.size();i++) {
			if(count<val.get(i).size()) {
				numb=i;
				count=val.get(i).size();
			}
		}
		StringBuilder builder = new StringBuilder();
			for(Character hh:val.get(numb).values()) {
				builder.append(hh);
			}
		System.out.println(builder.toString());
	}
}
