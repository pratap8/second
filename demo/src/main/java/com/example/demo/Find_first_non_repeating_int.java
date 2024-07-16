package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_first_non_repeating_int {

	public static void main(String[] args) {
		int[] a= {1,2,1,2,3,4,3,5,6};
		SolutionArr solution = new SolutionArr();
		System.out.println(solution.search(a));
	}
}

class SolutionArr{
	public int search(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int a=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {     //i=1; j=1
					arr[i]=-1;
					arr[j]=-1;
					a++;
				}
			}
			if(a==0 && arr[i]!= -1) {
				return arr[i];
			}
		}
		return -1;
		
	}
}
