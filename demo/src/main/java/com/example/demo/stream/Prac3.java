package com.example.demo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prac3 {

	public static void main(String[] args) {
//		Implement a method to calculate the Fibonacci sequence using Java streams:
//		Stream.iterate(new long[] {0,1}, fib->new long[] {fib[1],fib[0]+fib[1]}).limit(10).map(fib->fib[0]).forEach(System.out::println);
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,49);
//		Q. Find the median of a list of integers using Java streams:
		OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
//		System.out.println(average.toString());
//		Given a list of strings, find the longest common prefix using Java streams:
		List<String> strings = Arrays.asList("flower", "flow", "flight");
		String[] arr = new String[strings.size()];
		int j=0;
		for(String str:strings) {
			arr[j]=str;
			j++;
		}
		Arrays.sort(arr);
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(arr[0].charAt(i)!=arr[arr.length-1].charAt(i)) {
//				System.out.println(builder.toString());
				break;
			}
			builder.append(arr[0].charAt(i));
		}
		
		//Find frequency of character
		String str="Pratap";
		Map<Character, Long> collect = str.chars().map(Character::toLowerCase).mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
//		Find the maximum product of two integers in an array using Java streams:
		
		int[] array = {10, 4, 3, 6, 2,2,3,4, 7, 8,15};
		
//		Given an array of numbers find the 2nd largest number using Java 8 feature
		Optional<Integer> findFirst = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst();
//		System.out.println(findFirst);
//		Given array of number print distinct elements in array using Java 8 feature
//		Arrays.stream(array).distinct().forEach(System.out::println);
//		10. Given an array of numbers print only multiple of 5 using Java 8 feature
//		Arrays.stream(array).filter(x->x%5==0).forEach(System.out::println);
		
		Predicate<Integer> isEven = strr->strr%2==0;
		List<Integer> collect2 = list.stream().filter(isEven).collect(Collectors.toList());
        List<String> names = List.of("John", "Jane", "Alex", "Alice");
        List<String> collect3 = names.stream().filter(x->x.startsWith("J")).collect(Collectors.toList());
//        System.out.println(collect3);
        OptionalInt reduce = Arrays.stream(array).reduce((a,b)->a+b);
//        System.out.println(reduce);
//        OptionalInt reduce2 = Arrays.stream(array).reduce(Integer::max);
//        System.out.println(reduce2);
        list.stream().mapToInt(Integer::intValue).average();
//        names.stream().filter(X->X.length()>4).forEach(System.out::println);
        OptionalInt reduce2 = str.chars().reduce((a,b)->b+a);

	}
}
