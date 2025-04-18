package com.example.demo.arrays;

import java.util.Arrays;

public class Find_Max_Min {

	public static void main(String[] args) {
		int[] a= {3, 5, 4, 1, 9};
		System.out.println(Arrays.stream(a).min());
		System.out.println(Arrays.stream(a).max());
	}
}
