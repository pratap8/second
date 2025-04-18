package com.example.demo.recursive;

public class SumBetweenTheNumbers {

	public static void main(String[] args) {
		System.out.println(sum(5,10));
	}
	static int sum(int start, int end) {
		if(start<end) {
			return end+sum(start, end-1);
		}else {
			return 0;
		}
	}
}
