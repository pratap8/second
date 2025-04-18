package com.example.demo;

public class Finding_Largest_Numb_In_Double_Array {

	public static void main(String[] args) {
		int[][] aa= {
				{1,2,3},
				{4,5,6},
				{9,8,7}
		};
		System.out.println(getLargeNumb(aa));
	}
	static int getLargeNumb(int[][] aa) {
		int large=0;
		for(int i=0;i<aa.length;i++) {
			for(int a:aa[i]) {
				if(a>large) {
					large=a;
				}
			}
		}
		return large;
	}
}
