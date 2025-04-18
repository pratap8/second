package com.example.demo.String;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int[] numb= {132,4,54,32,5,65,43,56,35,34,243,7,565,443,34};
		System.out.println(withoutStream(numb));
	}
	static int withoutStream(int[] numb) {
		int temp=0;
		for(int i=0;i<numb.length;i++) {
			for(int j=i+1;j<numb.length;j++) {
				if(numb[j]<numb[i]) {
					temp=numb[i];
					numb[i]=numb[j];
					numb[j]=temp;
				}
			}
		}
		return numb[1];
	}
	static int logger(int[] numb) {
		Arrays.sort(numb);
		return numb[1];
	}
	static int withStream(int[] numb) {
		OptionalInt findFirst = Arrays.stream(numb).distinct().sorted().skip(1).findFirst();
		return findFirst.getAsInt();
	}

}
