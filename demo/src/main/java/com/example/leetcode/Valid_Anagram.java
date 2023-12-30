package com.example.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Valid_Anagram {

	public static void main(String[] args) {
		SolutionAnagram anagram = new SolutionAnagram();
//		anagram.isAnagram("Pratap", "aapptr");
		System.out.println(anagram.isAnagram("pratap", 
				"pratap"));
	}
}
class SolutionAnagram {
    public boolean isAnagram(String s, String t) {
    	char[] a=s.toCharArray();
    	char[] b=t.toCharArray();
    	Arrays.sort(a);
    	Arrays.sort(b);
    	for(char e:a) {
    		System.out.print(e+" ");
    	}
    	return Arrays.equals(a, b);
    }	
}

class SolutionAnagramA {
    public boolean isAnagram(String s, String t) {
    	return getSortedString(s).equals(getSortedString(t));
    }
    private String getSortedString(String s) {
        return s.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining());
    }
}

