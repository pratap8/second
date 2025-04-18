package com.example.demo.recursive;

public class NameNthTime {

	public static void main(String[] args) {
		callName(5, "Pratap");
	}
	static void callName(int nth, String name) {
		
		if(nth<=0) {
			return;
		}
		System.out.println(name);
		callName(nth-1,name);		
	}
}
