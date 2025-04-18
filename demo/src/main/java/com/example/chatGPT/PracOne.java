package com.example.chatGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracOne {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bujji","Bangaram","Bujjigadu","Bujji");
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
