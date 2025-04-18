package com.example.demo.arrays;

import java.util.Arrays;

public class Cycle_Rotate {

	public static void main(String[] args) {
		int[] classic = {1,0,0,0,2,3,0,4};
		printArray(classic);
	}
	static void printArray(int[] classic) {
		int[] wordly = new int[classic.length];
		wordly[0]=classic[classic.length-1];
		for(int i=1;i<classic.length;i++) {
			wordly[i]=classic[i-1];
			;
		}
		System.out.println(Arrays.toString(wordly));
	}
}
