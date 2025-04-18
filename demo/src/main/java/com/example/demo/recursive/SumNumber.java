package com.example.demo.recursive;

public class SumNumber {
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	static int sum(int last) {
		if(last<=1)
			return last;
		return last+sum(last-1);
	}
}
