package com.example.demo.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Strange_Printer {

	public static void main(String[] args) {
		System.out.println(strangePrinter("aaabbb"));
	}

	public static int strangePrinter(String s) {
		int k=0;
		Set<Character> aa = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(!aa.contains(s.charAt(i))) {
				k++;
			}
			aa.add(s.charAt(i));
		}
		return k;
	}
}
