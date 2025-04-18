package com.example.demo.syntax;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectSyntax {

	public static void main(String[] args) {
		Person person = new Person();
//		List<Integer> aa=Stream.iterate(10, n -> n + 1).collect(Collectors.toList());
//		System.out.println(aa);
		String name="Phool";
		System.out.println(name.chars().equals("Phool"));
	}
}
class Person{
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}