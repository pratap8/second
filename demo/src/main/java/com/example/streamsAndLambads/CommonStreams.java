package com.example.streamsAndLambads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.comparator.Comparators;

public class CommonStreams {

	public static void main(String[] args) {
		String str = "Pratap";
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Group numbers by odd or even
        List<Integer> numbers = List.of(1, 2, 3, 4,1000, 5, 6, 7, 8, 9, 10, 4,98);
        Map<String, List<Integer>> collect2 = numbers.stream().collect(Collectors.groupingBy(x->x%2==0?"even":"odd"));
//        System.out.println(collect2);
//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        numbers.stream().collect(Collectors.groupingBy(num->num%2==0?"even":"odd"));
        List<Integer> collect3 = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(collect3);
//        Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<String> collect4 = numbers.stream().map(nums->nums+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect4);
//        How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> value = new HashSet<Integer>();
        List<Integer> collect5 = numbers.stream().filter(x->!value.add(x)).collect(Collectors.toList());
//        System.out.println(collect5);
        Set<Integer> value1 = new TreeSet<Integer>(numbers);
//        value1.stream().forEach(System.out::println);
//        Given a list of integers, find the total number of elements present in the list using Stream functions?
        Long collect6 = numbers.stream().count();
//        System.out.println(collect6);
//        6. Given a list of integers, find the maximum value element present in it using Stream functions?
        long max = numbers.stream().max(Integer::compare).get();
//        System.out.println(max);
//        Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Optional<Character> filter = input.chars().mapToObj(ch->(char)ch).findFirst().filter(ch->input.indexOf(ch)==input.lastIndexOf(ch));
//        System.out.println(filter);
//        Given a String, find the first repeated character in it using Stream functions?
        Set<Character> seenCharacters = new HashSet<>();

        input.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst() .orElse(null);                
//        Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10,8,49,25,98,32,15);
        List<Integer> myList2 = myList;
//		Collections.sort(myList2);
//		System.out.println(myList2);
//		myList.stream().sorted().forEach(System.out::println);
//		Given a list of integers, sort all the values present in it in descending order using Stream functions?
//		 myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);;
//		 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Set<Integer> setData = new HashSet<Integer>();
        boolean anyMatch = myList.stream().anyMatch(x->!setData.add(x));
        System.out.println(anyMatch);
	}
}
