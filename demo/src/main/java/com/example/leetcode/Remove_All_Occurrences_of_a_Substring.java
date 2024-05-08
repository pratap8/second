package com.example.leetcode;

public class Remove_All_Occurrences_of_a_Substring {

	public static void main(String[] args) {
		SolutionOccur occur = new SolutionOccur();
		System.out.println(occur.removeOccurrences("daabcbaabcbc", "abc"));
	}
}

class SolutionOccur {
    public String removeOccurrences(String s, String part) {
    	    	while(s.indexOf(part) != -1) {
    		s=s.replaceFirst(part, "");
    		System.out.println(s);
    	}
        return s;
    }
}