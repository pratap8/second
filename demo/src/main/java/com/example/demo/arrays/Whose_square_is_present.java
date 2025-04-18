package com.example.demo.arrays;

import java.util.Arrays;

public class Whose_square_is_present {

	public static void main(String[] args) {
		int[] numb= {1, 4, 5, 9, 15, 16, 25, 30};
		int[] numb1=new int[numb.length];
		int k=0;
		for(int i=0;i<numb.length;i++) {
			for(int j=i+1;j<numb.length;j++) {
				if(numb[i]*numb[i]==numb[j]) {
					numb1[k]=numb[i];
					k++;
				}
			}
		}
		numb1=Arrays.stream(numb1).filter(x->x!=0).toArray();
		System.out.println(Arrays.toString(numb1));
		
		
	}
}
