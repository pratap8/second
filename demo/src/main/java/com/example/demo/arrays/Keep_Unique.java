package com.example.demo.arrays;

import java.util.HashSet;
import java.util.Set;

public class Keep_Unique {

	public static void main(String[] args) {
		int[] first= {1,4,2,3,5,4};
		int[] second = {7,2,4,1,5};
		printArray(first,second);
	}
	static void printArray(int[] first, int[] second) {
		Set<Integer> max = new HashSet<Integer>();
		for(int a: first) {
			max.add(a);
		}
		for(int a:second) {
			max.add(a);
		}
		System.out.println(max);
	}
}
