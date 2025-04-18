package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_of_Multiple_Arrays {

	public static void main(String[] args) {
		int[][] nums= {
			    {3, 1, 2, 4, 5},
			    {1, 2, 3, 4},
			    {3, 4, 5, 6}
			};
		List<Integer> aa= intersection(nums); 
//		System.out.println(aa);
		prac(nums);
	}
	public static List<Integer> intersection(int[][] nums) {
       List<Integer> aa= new ArrayList<Integer>();
       for(Integer a:nums[0]) {
    	   aa.add(a);
       }
       for(int i=1;i<nums.length;i++) {
    	   ArrayList<Integer> bb = new ArrayList<Integer>();
    	   for(Integer cc : nums[i]) {
    		   bb.add(cc);
    	   }
    	   aa.retainAll(bb);
       }
       Collections.sort(aa);
       return aa;
	}
	
	static void prac(int [][] nums) {
		int[] count = new int[1001];
		for (int[] num : nums) {
			for (int n : num) {
				count[n]++;
			}
		}
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for(int i=1;i<1000;i++) {
			if(count[i]==nums.length)
				aa.add(i);
		}
		System.out.println(aa);
	}
}
