package com.example.prac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class SimpleOne {
	static String name="Pratap";
	 static int age =24;
	 static Integer yoe= 3;
	 void printValue(String name, int age, Integer yoe){
		System.out.println(name+" "+age+" "+yoe);
		name="John";
		age=30;
		yoe=30;
		
	}

	public static void main(String[] args) {
		SimpleOne forest=new SimpleOne();
		forest.printValue(name, age, yoe);
		System.out.println(name+" "+age+" "+yoe);

	}
	
}


