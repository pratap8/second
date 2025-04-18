package com.example.demo.String;

import java.util.Arrays;

public class Hash_Divided_String {

	public static void main(String[] args) {
		System.out.println(stringHash("mxz",3));
	}
//	abcd,2
//	ab=1
//	cd=2
//	a=0,b=1-->0+1=1%26=1 
//	c=2,d=3-->2+3=5%26=5
	static String stringHash(String s, int k) {
	       String a="";
			char[]fruit=s.toCharArray();
	        int z=0;
	        int j=1;
			for(int i=0;i<s.length();i++){
	            z+=fruit[i];
	            z-=97;
	            if(j==k){
	                j=0;
	                int ascii = (z%26)+97; 
	                System.out.println(ascii);
	                char ch = (char) (ascii);
	                a+=ch + "";
	                z=0;                 
	            }
	            j++;
	        }
			return a;
	}
}
