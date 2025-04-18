package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac2 {

	public static void main(String[] args) {
//		 Implement a method to calculate the Fibonacci sequence using Java streams:
//		IntStream.of(i->i+i).filter(i->i<100);

		List<String> strings = Arrays.asList("flower", "flow", "flight");
		String longestCommonPrefix = strings.stream().reduce((s1, s2) -> {
			int length = Math.min(s1.length(), s2.length());
			int i = 0;
			while (i < length && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return s1.substring(0, i);
		}).orElse("");
//		System.out.println("Longest common prefix: " + longestCommonPrefix);
		List<String> words = Arrays.asList("listen", "silent", "hello", "world", "night", "thing", "car","arc");
		Map<String, List<String>> anagrams = words.stream().collect(Collectors.groupingBy(str -> {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}));
		System.out.println("Anagrams: " + anagrams);
	}
}
