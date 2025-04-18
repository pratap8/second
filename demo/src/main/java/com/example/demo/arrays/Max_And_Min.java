package com.example.demo.arrays;

import java.util.Arrays;

public class Max_And_Min {

	public static void main(String[] args) {
		int[] max = {1,3,5,7,9,2,0,4,6};
		printArray(max);
	}
	static void printArray(int[] max) {
		System.out.println(Arrays.stream(max).max().getAsInt());
		System.out.println(Arrays.stream(max).min().getAsInt());
	}
}
