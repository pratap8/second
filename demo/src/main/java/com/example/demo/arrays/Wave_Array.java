package com.example.demo.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Wave_Array {

	public static void main(String[] args) {
		int a[] = {10, 5, 6, 3, 2, 20, 100, 80};
		printDup(a);
	}
	static void printDup(int[] a) {
		Arrays.sort(a);
		int temp=0;
		int j=a.length-1;
		for(int i=0;i<a.length;i++,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
