package com.example.demo.arrays;

import java.util.Arrays;

public class Put_Zeros_On_Last {

	public static void main(String[] args) {
		int[] classic = {1,0,0,0,2,3,0,4};
		printArray(classic);
	}
	static void printArray(int[] classic) {
		int[] wordly = new int[classic.length];
		int j=0;
		for(int i=0;i<classic.length;i++) {
			if(classic[i]!=0) {
				wordly[j]=classic[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(wordly));
	}
}
