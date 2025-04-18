package com.example.demo.recursive;

public class BackTrackRecursive {

	public static void main(String[] args) {
		backTrack(10);
	}
	static void backTrack(int n) {
		if(n<=0) {
			return;
		}
		backTrack(n-1);
		System.out.println(n);
	}
}
