package com.example.demo.arrays;

import java.util.Arrays;

public class Send_To_Last {

	public static void main(String[] args) {
		int[] last = {1,3,4,5,6,2};
		printArray(last,3);
	}
	static void printArray(int[] last,int numb) {
		int[] temp=new int[last.length];
		int j=0;
		for(int i=numb;i<last.length;i++,j++) {
			temp[j]=last[i];
		}
		j=0;
		for(int i=last.length-numb;i<temp.length;i++,j++) {
			temp[i]=last[j];
		}
		System.out.println(Arrays.toString(temp));
	}
}
