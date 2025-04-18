package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remove_Duplicates_from_Sorted_Array_II_80 {

	public static void main(String[] args) {
		Remove_Duplicates_from_Sorted_Array_II_80 array_II_80 = new Remove_Duplicates_from_Sorted_Array_II_80();
		int[] nums= {1,1,1,2,2,3};
		System.out.println(array_II_80.removeDuplicates(nums));
	}
	public int removeDuplicates(int[] nums) {
        int result=0;
        Map<Integer, Integer> val = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            val.put(nums[i],val.getOrDefault(nums[i],0)+1);
        }
        for(Entry<Integer, Integer> mapper: val.entrySet()){
            if(mapper.getValue()<2){
                result+=1;
            }else if(mapper.getValue()>=2){
                result+=2;
            }
        }
        return result;
    }
}
