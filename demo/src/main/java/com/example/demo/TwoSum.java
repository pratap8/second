package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 
	public static void main(String[] args) {
		Two q = new Two();
		Solution solution = new Solution();
		int []b= {2,5,5,11};
		q.twoSum(b, 10);
//		solution.twoSum(b, 10);
	}
}
class Two{
	 public int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++) {
	        	for(int j=i+1;j<nums.length;j++) {
	        		if(nums[i]+nums[j]==target) {
	        			int[] a= {i,j};
	        			System.out.println(i+" "+j);
	        			return a;
	        		}
	        	}
	        }
			
			return null;
			
	    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
            	System.out.println(numToIndex.get(i));
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
