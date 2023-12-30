package com.example.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Single_Number {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a= {4,1,2,1,2};
		solution.singleNumber(a);
//		System.out.println(solution.singleNumber(a));
	}
}
class Solution {
    public int singleNumber(int[] nums) {
    	  int ans=nums[0];
    	  Arrays.sort(nums);
          int i=0;
          while(i<nums.length-1){
              ans=ans^nums[i+1];
              i++;
          }
          System.out.println(ans);
          return ans;
      }
}