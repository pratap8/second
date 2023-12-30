package com.example.leetcode;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		SolMerge solMerge = new SolMerge();
		int []nums1 = {1,2,3,0,0,0};
		int []nums2 = {2,5,6};
		int n = 3;
		int m=3;
		int []a=new int[m+n];
		a=solMerge.merge(nums1, m, nums2, n);
		for(int e:a) {
			System.out.println(e);
		}
	}
}
class SolMerge {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int []a=new int[m+n];
        int d=0;
        for(int i=0;i<m;i++){
            if(nums1[i]!=0){
                a[d]=nums1[i];
                System.out.println(a[d]);
                d++;
            }
        }
        int e=m-1;
        for(int j=0,i=m-1;i<(m+n);i++,j++){
            if(nums2[j]!=0){
            	System.out.println(nums2[j]);
                a[e]=nums2[j];
                e++;
            }
        }
        return a;

    }
}
