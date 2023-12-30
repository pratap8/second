package com.example.leetcode;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		Intersection intersection = new Intersection();
		int []a= {1,2,2,1};
		int []b= {2,2};
		int[] c=intersection.intersect(a, b);
		for(int e:c) {
			System.out.print(e+" ");
		}
	}
}
class Intersection {
    private int[] a;

	public int[] intersect(int[] nums1, int[] nums2) {
     if(nums1.length>nums2.length) {
    	 int[]a=new int[nums1.length];
     }
     else{
    	 int[]a=new int[nums2.length];
     }
     int b=0;
    	for(int i=1;i<nums1.length;i++) {
    		for(int j=1;j<nums2.length;j++) {
    			if(nums1[i]==nums2[j] && nums1[i-1]==nums2[j-1]) {
    				a[b]=nums1[i];
    				a[b+1]=nums1[j];
    				b+=2;
    			}
    		}
    	}
    	return a;
    }
}
