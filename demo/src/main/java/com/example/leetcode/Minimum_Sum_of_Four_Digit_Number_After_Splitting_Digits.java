package com.example.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {

	public static void main(String[] args) {
		FourDigit digit = new FourDigit();
//		System.out.println(digit.nums(5432));
		Digital digital = new Digital();
		System.out.println(digital.digit(4009));
	}
}

class FourDigit{
	
	public int nums(int num) {
		int z=0;
		int[] a=new int[4];
		for(int i=0;i<a.length;i++) {
			a[i]=num%10;
			num=num/10;
		}
		Arrays.sort(a);
		int b=a[0]*10+a[2];
		int c=a[1]*10+a[3];
		int d=a[0]*10+a[3];
		int e=a[1]*10+a[2];
		if(b+c>d+e) {
			System.out.println(b+c);

			return b+c;
		}else {
			return d+e;
		}
	}
}
class Digital{
	int digit(int nums) {
		int []a=new int[4];
		int i=0;
		while(nums>0) {
			a[i]=nums%10;
			nums=nums/10;
			i++;
		}
		Arrays.sort(a);
		return (a[0]*10+a[2])+(a[1]*10+a[3]);
	}
}