package com.example.demo.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListPrac {

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog","cat","Elephant","rabbit","fox","giraffe","ant","zebra","owl");
		Map<Integer, Long> collect = animals.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(collect);
		Map<Integer, Integer> groupByLength = new HashMap<Integer, Integer>();
		for(int i=0;i<animals.size();i++) {
			groupByLength.put(animals.get(i).length(), groupByLength.getOrDefault(animals.get(i).length(), 0)+1);
		}
		for(Entry<Integer, Integer> aa: groupByLength.entrySet()) {
			System.out.println("String of length: "+aa.getKey()+":"+aa.getValue());
		}
	}
}
