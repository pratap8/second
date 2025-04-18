package com.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RetrieveHighestPeakInAList {

	public static void main(String[] args) {
		List<Integer> high = Arrays.asList(1,3,7,6,6,6,6,4,3,2,1);
		int j=0;
		
		for(int i=0;i<high.size();i++) {
			if(high.get(i)>j) {
				j=high.get(i);
			}
		}
		System.out.println(j);
//		Optional<Integer> peak2 = high.stream()
//		   .reduce((a, b) -> a > b ? a : b);
//		Optional<Integer> c=high.stream().max((a,b)->Integer.compare(a, b));
//		System.out.println(c);
	}
}
