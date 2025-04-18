package com.example.demo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.client.RestTemplate;

public class Pracs {

	public static void main(String[] args) {
//		Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,49);
		int[] lister = {10,15,8,49,25,98,32,49};
//		List<Integer> collect = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(collect);
//		 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//		list.stream().map(x->x+"").filter(x->x.startsWith("1")).forEach(System.out::println);
//		How to find duplicate elements in a given integers list in java using Stream functions?
//		HashSet<Integer> setter = new HashSet<Integer>();
//		list.stream().filter(n->!setter.add(n)).forEach(System.out::println);
		
//		list.stream().map(x->x+"").filter(x->x.startsWith("1")).forEach(System.out::println);
//		HashSet<Integer> dup = new HashSet<Integer>();
//		list.stream().filter(x->!dup.add(x)).forEach(System.out::println);
//		4. Given the list of integers, find the first element of the list using Stream functions?
//		list.stream().findFirst().ifPresent(System.out::println);
		
//		5. Given a list of integers, find the total number of elements present in the list using Stream functions?
//		long count = list.stream().count();
//		System.out.println(count);
//		6. Given a list of integers, find the maximum value element present in it using Stream functions?
//		Integer integer = list.stream().max(Integer::compareTo).get();
//		System.out.println(integer);
//		9. Given a list of integers, sort all the values present in it using Stream functions?		
//		list.stream().sorted().forEach(System.out::println);
//		10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
//		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//		Set<Integer> inter = new HashSet<Integer>();
//		System.out.println(Arrays.stream(lister).anyMatch(x->!inter.add(x)));
//		
		//find the unique word and arrange in alphabetical order
//		String str="Java is fun and Java is powerful";
//		String[] str1=str.split(" ");
//		Arrays.asList(str1).stream().map(x->x.toLowerCase()).sorted().distinct().forEach(System.out::println);
//		Find max number in a integer using stream
		
		Optional<Integer> max = list.stream().max(Integer::compare);
		max.ifPresent(System.out::println);
		Optional<Integer> min = list.stream().min(Integer::compare);
		min.ifPresent(System.out::println);
		
	}
}

