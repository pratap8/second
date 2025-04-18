package com.example.leetcode;

import java.util.Arrays;

public class Reverse_Integer_7 {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
		System.out.println(Integer.MAX_VALUE-1534236469);
		if(x>Integer.MAX_VALUE-1 || x<Integer.MIN_VALUE) {
			return 0;
		}
		
		int j=0;
		boolean neg=false;
		if(x<0) {
			x=x*-1;
			neg=true;
		}
		for(int i=0;x>0;i++) {
			
			j=x%10+j*10;
			x/=10;
		}
		if(neg) {
			j=j*-1;
		}
        return j;
    }
}
