package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Check_if_One_String_Swap_Can_Make_Strings_Equal {
	public static void main(String[] args) {
		SolutionCheck check = new SolutionCheck();
		System.out.println(check.areAlmostEqual("bank", "kanb"));
	}
}
class SolutionCheck {
    public boolean areAlmostEqual(String s1, String s2) {
        char [] a = s1.toCharArray();
        char []b = s2.toCharArray();
        int z=1;
        Map<Character, Integer> show = new HashMap<Character,Integer>();
        Map<Character, Integer> showb = new HashMap<Character,Integer>();
        for(int i=0;i<a.length;i++) {
        	if(a[i] == b[i]) {
        		show.put(a[i], z);
            	showb.put(b[i], z);
        	}else if(a[i]!=b[i]) {
        	
        	z++;
        }
        System.out.println(show);
        System.out.println(showb);
        for(int j=0;j<show.size();j++) {
        	if(!show.equals(showb)) {
        		return false;
        	}
        }
        return true;
    }
		return false;
}}
