package com.example.streamsAndLambads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrac2 {

	public static void main(String[] args) {
//		Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	      List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,49);
	      List<Integer> collect = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//	      System.out.println(collect);
//	      Find Max value in list
	      Optional<Integer> max = list.stream().max((a,b)->Integer.compare(a, b));
//	      System.out.println(max);
//	      Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	      List<String> collect2 = list.stream().map(x->x+" ").filter(x->x.startsWith("1")).collect(Collectors.toList());
//	      System.out.println(collect2);
//	      How to find duplicate elements in a given integers list in java using Stream functions?
	      Set<Integer> integers = new HashSet<Integer>();
	      List<Integer> collect3 = list.stream().filter(x->!integers.add(x)).collect(Collectors.toList());
//	      System.out.println(collect3);
//	      Given the list of integers, find the first element of the list using Stream functions?
	      Optional<Integer> findFirst = list.stream().findFirst();
//	      System.out.println(findFirst);
//	      Given a list of integers, find the total number of elements present in the list using Stream functions?
	      Long collect4 = list.stream().collect(Collectors.counting());
//	      System.out.println(collect4);
//	      Given a list of integers, find the maximum value element present in it using Stream functions?
	      Integer max2 = list.stream().max(Integer::compareTo).get();
//	      System.out.println(max2);
//	      Given a String, find the first non-repeated character in it using Stream functions?
	      String input = "Java articles are Awesome";
	      Set<Character> set = new HashSet<Character>();
	      Optional<Character> first = input.chars().mapToObj(ch->(char)ch).filter(ch->input.lastIndexOf(ch)==input.indexOf(ch)).findFirst();
//	      System.out.println(first);
//	      Given a String, find the first repeated character in it using Stream functions?
	      Optional<Character> findFirst2 = input.chars().mapToObj(ch->(char)ch).filter(x->!set.add(x)).findFirst();
//	      System.out.println(findFirst2);
//	      Given a list of integers, sort all the values present in it using Stream functions?
	      List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//	      myList.stream().sorted().forEach(System.out::println);
//	      Given a list of integers, sort all the values present in it in descending order using Stream functions?
//	      myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	      int[] arr  = {10,15,8,49,25,98,98,32,15};
	      OptionalDouble max3 = Arrays.stream(arr).average();
//	      System.out.println(max3);
//	      Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	      

	      
	}
}
