package com.example.streamsAndLambads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Jithin", "Arunima", "Akhil", "Matthew", "Benjamin","Benja");
		Collections.sort(names);
		System.out.println(names);
	}
}
