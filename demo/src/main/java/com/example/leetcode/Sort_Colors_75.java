package com.example.leetcode;

import java.util.TreeMap;

public class Sort_Colors_75 {

	public static void main(String[] args) {
		SolutionSort sol = new SolutionSort();
		int[] aa = {2,0,2,1,1,0};
		sol.sortColors(aa);
	}
}
class SolutionSort {
    public void sortColors(int[] nums) {
    	TreeMap<Integer, Integer> val = new TreeMap<>();
        for(int aa:nums){
            val.put(aa,val.getOrDefault(aa,0)+1);
        }
        int ind=0;
        for(int i=0;i<nums.length;i++){
            int freq=val.get(i);
            for(int j=0;j<freq;j++){
                if(0==val.get(i)){
                    nums[ind]=0;
                }
                if(1==val.get(i)){
                    nums[ind]=1;
                }
                if(2==val.get(i)){
                    nums[ind]=2;
                }
                ind++;
            }
        }
        
    }
}