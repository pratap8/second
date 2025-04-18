package com.example.demo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Search_First_Index_Of_Given_Element {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		getTheDigitIndex(arr, 3);
	}
	static void getTheDigitIndex(int[] arr,int head) {
		ArrayList<Integer> clist = new ArrayList<>(); 
		  
        // adding elements of array 
        // to ArrayList 
        for (int i : arr) 
            clist.add(i); 
  
        // returning index of the element 
        System.out.println(clist.indexOf(head)); 
	}
}
