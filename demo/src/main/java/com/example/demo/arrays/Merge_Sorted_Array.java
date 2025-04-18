package com.example.demo.arrays;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2 = {1};
		int[] temp=getArray(nums1,0,nums2,1);
		Arrays.stream(temp).forEach(System.out::println);
	}
	static int[] getArray(int[] nums1, int m, int[] nums2, int n) {
		int [] temp = new int[m+n];
		int j=0;
		for(int i=0;i<m+n;i++) {
			if(i<m) {
				temp[i]=nums1[i];
			}else if(j<n){
				temp[i]=nums2[j];
				j++;
			}
		}
		for(int i=0;i<temp.length;i++) {
			for(int k=i+1;k<temp.length;k++) {
				if(temp[i]>temp[k]) {
					j=temp[i];
					temp[i]=temp[k];
					temp[k]=j;
				}
			}
		}
        nums1=temp;
		return nums1;
	}
}
