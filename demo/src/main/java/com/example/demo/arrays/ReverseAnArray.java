package com.example.demo.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
//		int[] b=IntStream.range(0, array.length).map(x->array[array.length-x-1]).toArray();
		int[] b=IntStream.range(0, a.length).map(x->a[a.length-x-1]).toArray();
		System.out.println(Arrays.toString(b));
	}
}
