package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum_15 {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(getSum(nums));
	}
	static List<List<Integer>> getSum(int[] nums){
		 List<List<Integer>> total=new ArrayList<>();
	        int a=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            List<Integer> aa=new ArrayList<>();
	            for(int j=i+1;j<nums.length;j++){
	                for(int k=j+1;k<nums.length;k++){
	                    if(i!=j && i!=k && j!=k){
	                        a=nums[i]+nums[j]+nums[k];
	                        if(a==0){
	                            aa.add(nums[i]);
	                            aa.add(nums[j]);
	                            aa.add(nums[k]);
	                        }
	                    }
	                }
	                if(!aa.isEmpty()){
	                    total.add(aa);
	                    aa=new ArrayList();
	                }
	            }
	        }
	        for(int i=0;i<total.size();i++) {
	        	for(int j=i+1;j<total.size();j++) {
	        	}
	        }
	        return total;
	    }
	}