package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.apache.el.stream.Stream;

public class SquareOfNumbUsingStream {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
//		Arrays.stream(nums).mapToLong(a->a*a).forEach(System.out::println);
		
		List<Integer> b = Arrays.asList(1,2,3,4,5);
		Double c=b.stream().mapToLong(a->a*a).average().getAsDouble();
		System.out.println(c);
		String a= "qwertyu";
//		String b=a.charAt(i);
	}
	

}
