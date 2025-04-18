package com.example.demo;

import java.util.Arrays;

public class Reverse_Each_String_in_sentence {
	public static void main(String[] args) {
		String aa="try coding";
		String [] a = aa.split(" ");
		StringBuilder builder = new StringBuilder();
		StringBuilder builder1 = new StringBuilder();
		for(int i=0;i<a.length;i++) {
			if(i+1==a.length) {
				builder1.append(a[i]).reverse();
				builder.append(builder1);
				builder1=new StringBuilder();
			}else {
				builder1.append(a[i]).reverse();
				builder.append(builder1+" ");
				builder1=new StringBuilder();
			}
		}
		System.out.println(builder.toString());
	}
}
