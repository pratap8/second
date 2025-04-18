package com.example.demo.arrays;

public class Cyclically_Rotate {

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5} ;
		int[] b=new int[a.length];
		for(int i=0;i<a.length-1 ;i++) {
				b[i]=a[i+1];
		}
		b[a.length-1]=a[0];
		for(int c:b) {
			System.out.println(c);
		}
	}
}
