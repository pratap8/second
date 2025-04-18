package com.example.leetcode;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		Remove_Duplicates_from_Sorted_Array_26 array_26 = new Remove_Duplicates_from_Sorted_Array_26();
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		array_26.removeDuplicates(nums);
	}
	public int removeDuplicates(int[] nums) {
        int curr=-99,i=0;
        int[] numb= new int[nums.length];
        for(int aa:nums){
            if(curr!=aa){
                curr=aa;
                numb[i]=aa;
                i++;
            }
        }
        nums=numb;
        for(int aa:nums) {
        	System.out.println(aa);
        }
        return i;
    }
}
