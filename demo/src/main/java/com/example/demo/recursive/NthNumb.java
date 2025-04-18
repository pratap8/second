package com.example.demo.recursive;

public class NthNumb {

	public static void main(String[] args) {
		nthNumb(11,19);
	}
	static void nthNumb(int start,int end) {
		int i=start;
		if(i>end) {
			return;
		}
		System.out.println(i++);
		nthNumb(i,end);
	}
}
