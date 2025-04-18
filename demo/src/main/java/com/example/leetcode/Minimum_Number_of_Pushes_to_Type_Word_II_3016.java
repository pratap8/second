package com.example.leetcode;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Minimum_Number_of_Pushes_to_Type_Word_II_3016 {

	public static void main(String[] args) {
		String word = "afhtgpque";
		TreeMap<Character, Integer> pushes = new TreeMap<Character, Integer>();
		char[] charWord = word.toCharArray();
		for(char wordly: charWord) {
			pushes.put(wordly, pushes.getOrDefault(wordly, 0)+1);
		}
		List<Integer> collect = pushes.values().stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		int count=0;
		int i=1;
		for(int numb: collect) {
			if(i<9) {
				count=count+numb;
			}else if(i>8 && i<17) {
				count=count+numb*2;
			}else if(i>16 && i<25) {
				count=count+numb*3;
			}else {
				count =count+ numb*4;
			}
			i++;
		}
		System.out.println(count);
	}
}
