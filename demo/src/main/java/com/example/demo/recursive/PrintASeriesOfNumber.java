package com.example.demo.recursive;

public class PrintASeriesOfNumber {

	public static void main(String[] args) {
		numb(5,10);
	}
	static int numb(int k) {
		if(k>=0) {
			System.out.println(k);
			return numb(k-1);
		}
		return 0;
	}
	static int numb(int start,int end) {
		if(start<=end) {
			System.out.println(start++);
			return numb(start,end--);
		}
		
		return 0;
	}
}
