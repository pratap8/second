package com.example.demo.recursive;

public class FactorialInJava {

	public static void main(String[] args) {
		System.out.println(factor(4));
	}
	static int factor(int numb) {
		if(numb>0) {
			return numb*factor(numb-1);
		}else {
			return 1;
		}
	}
}
