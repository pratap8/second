package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_sum_negative_int {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3,-1,-1,-5);
		int b=a.stream().filter(x->x<0).mapToInt(x->x).sum();
		System.out.println(b);
		}
}
