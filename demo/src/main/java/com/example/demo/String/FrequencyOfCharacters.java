package com.example.demo.String;

import java.security.Identity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "pratap";
		Map<Character, Long> collect = str.chars().map(Character::toLowerCase).mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}
}
