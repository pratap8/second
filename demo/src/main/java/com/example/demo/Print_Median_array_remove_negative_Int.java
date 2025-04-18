package com.example.demo;

import java.util.Arrays;

public class Print_Median_array_remove_negative_Int {

	public static void main(String[] args) {
//		int[] a = {6,4,-5,14,12,-6};
		int[] a= {7,-3,8,2,-5,10,12};
		int[] d= Arrays.stream(a).filter(x->x>0).toArray();
		int mid = d.length;
		
		if(mid%2==0) {
			System.out.println(d[mid/2-1]);
		}else {
			System.out.println(d[mid/2]);
		}
	}
}
