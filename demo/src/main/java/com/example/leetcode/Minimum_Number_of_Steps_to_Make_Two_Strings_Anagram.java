package com.example.leetcode;

public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {

	public static void main(String[] args) {
		Anar anagram = new Anar();
		anagram.minSteps("anagram", "mangaar");
	
	}
}

class Anar{
    public void minSteps(String s, String t) {
    	int steps=0;
    	int[] count= new int[26];
    	int z=0;
    	for(int i=0;i<s.length();i++) {
    		count[s.charAt(i)-'a']++;
    		System.out.println(s.charAt(i)-'a'+"   "+s.charAt(i)+"   "+count[s.charAt(i)-'a']++);
    		count[t.charAt(i)-'a']--;
    		System.out.println(t.charAt(i)-'a'+"    "+t.charAt(i)+"   "+count[t.charAt(i)-'a']--);
    	}
    	for(int a: count) {
//    		System.out.println(a);
    		if(a>0) {
    			steps+=a;
    		}
    		
    	}
    	System.out.println(steps+"    <-");
//    	return steps;
    	
    	
    }
	
}