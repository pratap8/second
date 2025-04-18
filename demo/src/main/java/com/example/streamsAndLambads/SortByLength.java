package com.example.streamsAndLambads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {

	public static void main(String[] args) {
		String [] names= {"Jithin", "Arunima", "Akhil", "Matthew", "Benjamin"};
		List<String> nameList = Arrays.asList(names);
		Comparator<String> namer = (name1,name2)->(name1.length()>name2.length())?1:-1;
		Collections.sort(nameList, namer);
		Arrays.stream(names).forEach(x->System.out.println(x));
	}
}
