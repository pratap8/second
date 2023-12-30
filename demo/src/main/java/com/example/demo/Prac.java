package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Prac {

	public static void main(String[] args) {
		String a = new String("HI");
		System.out.println(a);
		StringBuilder b = new StringBuilder(a);
		System.out.println(b.reverse());
		
		int[] arr = {1,2,3,4};
		
		Collections.reverse(Arrays.asList(arr)); 
		for(int e:arr) {
			System.out.print(e+" ");
		}
		int []z= {2,5,5,11};
		Map<Integer, Integer> numToIndex = new HashMap<>();
		if(numToIndex.containsKey(10 - z[1])) {
			System.out.println(numToIndex.get(z));
		};
	}
	
}
