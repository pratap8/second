package com.example.leetcode;

import java.util.Arrays;
import java.util.List;

public class Contains_Duplicate {

	public static void main(String[] args) {
		Major major= new  Major();
		int[] nums= {1,2,3,0};
		major.containsDuplicate(nums);
		System.out.println(major.containsDuplicate(nums));
	}
}
class Major {
    public boolean containsDuplicate(int[] nums) {
      List a = Arrays.asList(nums);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
          if(a.contains(nums[i])) {
        	  return true;
          }
        }
        return false;
    }
}
