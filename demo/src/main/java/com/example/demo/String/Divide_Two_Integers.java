package com.example.demo.String;

public class Divide_Two_Integers {

	public static void main(String[] args) {
		int dividend=-2147483648;
		int divisor=-1;
		 if(dividend<=Integer.MIN_VALUE) {
				dividend=-Integer.MAX_VALUE;
			}
        System.out.println(dividend/divisor);
	}
}
