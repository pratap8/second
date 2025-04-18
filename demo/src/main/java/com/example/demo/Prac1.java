package com.example.demo;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,44,6,7,8,9,9,1);
		List<Integer> list2=Arrays.asList(2,44,6,7,8,9,9,1);
		List<String> listString=Arrays.asList("phool","babu","raj","pratap","singh");
		int [] aa = {1,2,3,4,5,6};
		int [] bb = {6,4,2,5,3,1};
		String[] aaa = {"phool","babu","raj","pratap","singh"};
		String[] bbb={"phool","babu","raj","pratap","singh"};
		
//		List<Integer> list3 = Stream.of(list,list2).flatMap(x->x.stream()).sorted().collect(Collectors.toList());
//		System.out.println(list3);
//		String a = "Pratap";
//		System.out.println(list3.stream().filter(x->x==1).findAny().isPresent());
//		System.out.println(a.chars().mapToObj(c->c).filter(x->x=='a').findAny().isPresent());
//		System.out.println(Arrays.stream(aa).filter(x->x==5).findAny().isPresent());
//		 String a = "labal";
//		 System.out.println(Stream.of(a).anyMatch(x->x.contains(' ')));
//		 System.out.println(new StringBuilder(a).reverse().);
//		 System.out.println(a.chars().mapToObj(c->(char)c).filter(c->c=='m').findAny().isPresent());
//		System.out.println(bb.equals(Arrays.stream(aa).mapToObj(x->aa)		System.out.println(Arrays.equals(Arrays.sort(aa),Arrays.sort(bb)));
//		System.out.println(a.substring(3));
		List<Integer> ll = new LinkedList<Integer>();
		TreeSet<String> ts=new TreeSet<String>((aStr,bStr) -> bStr.compareTo(aStr));
		Collections.sort(listString);  
		System.out.println(listString);
		
	}
}
