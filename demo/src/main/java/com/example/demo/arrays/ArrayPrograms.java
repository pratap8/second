package com.example.demo.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPrograms {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
//		List<Integer> b = Arrays.stream(array).boxed().collect(Collectors.toList());
//		Collections.reverse(b);
//		System.out.println(b);
//		int[] b=IntStream.range(0, array.length).map(x->array[array.length-x-1]).toArray();
//		System.out.println(Arrays.toString(b));
//		int [] d=reverseArray(array);
//		for(int x:d) {
//			System.out.println(x);
//		}
//		int [] b = IntStream.range(0, array.length).map(x->array[array.length-x-1]).toArray();
//		System.out.println(Arrays.toString(b));
//		for(int c:b) {
//			System.out.println(c);
//		}
//		List<Integer> b = Arrays.stream(array).boxed().collect(Collectors.toList());
		List<Integer> b = Arrays.stream(array).boxed().collect(Collectors.toList());
		Collections.reverse(b);
		System.out.println(b);
		int  x=Arrays.stream(array).min().orElse(0);
		int y=Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
		
		System.out.println(x+" "+y);
		
	}
	static int[] reverseArray(int[] b) {
		int[] c=new int[b.length];
		for(int i=b.length-1,j=0;i>=0;i--,j++) {
			c[j]=b[i];
		}
		return c;
	}
}