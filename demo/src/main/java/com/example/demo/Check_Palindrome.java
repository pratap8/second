package com.example.demo;

public class Check_Palindrome {
public static void main(String[] args) {
	Palin palin = new Palin();
	String [] a= {"assa","addre","return","assa"};
	palin.palin(a);
}
}

class Palin{
	String z;
	String[] palin(String[] a){
		String[] b=null;
		
		for(int i=0; i<a.length;i++) {
			z=a[i];
			for(int j=0;j<a[i].length();j++) {
				String y;
				System.out.println(z.charAt(i));
			}
		}
		return b;
	}
		
	}
	
