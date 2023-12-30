package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
		Run r = new Run();
		String[] a = {"practice.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org"};
		r.run(a);
		for(String e:a) {
			System.out.println(e);
		}
	}
}
class Run{
	public String[] run(String[] a) {
			 String []b= new String[a.length];
				Arrays.sort(a);
				for(int i=0;i<=a.length-1;i++) {
					b[i]=a[i];
				}
				return b;
		 
		
	}
}