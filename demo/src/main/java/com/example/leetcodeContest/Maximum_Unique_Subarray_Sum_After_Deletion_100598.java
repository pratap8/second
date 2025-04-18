package com.example.leetcodeContest;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Unique_Subarray_Sum_After_Deletion_100598 {

	public static void main(String[] args) {
		Maximum_Unique_Subarray_Sum_After_Deletion_100598 aa = new Maximum_Unique_Subarray_Sum_After_Deletion_100598();
		int[] ab= {-17,-15};
		System.out.println(aa.maxSum(ab));
	}
	public int maxSum(int[] nums) {
		HashMap<Integer,Integer> mapper = new HashMap<>();
        for(int num:nums){
            
                mapper.put(num, mapper.getOrDefault(num,0)+1);
            
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> map: mapper.entrySet()){
            if(map.getKey()<=0){
            	if(map.getKey()>max) {
            		max=map.getKey();
            	}
                
            }else{
                count+=map.getKey();
            }
            
        }
        return count>0?count:max;
    }
}
