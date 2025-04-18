package com.example.interview;

import java.util.Arrays;
import java.util.List;

public class Sort_List_Of_String_Based_On_Length {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("phool","babu","raj","pratap","singh");
		List<String> namer = name.stream().sorted((a,b)->Integer.compare(a.length()	, b.length())).toList();
		List<String> list = name.stream().sorted().toList();
		System.out.println(list);
	}
}
