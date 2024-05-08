package com.example.leetcode;

import java.util.stream.IntStream;

public class Defanging_an_IP_Address {

	public static void main(String[] args) {
		IpAddress address = new IpAddress();
		System.out.println(address.defangIPaddr("1.1.1.1"));
	}
}

class IpAddress{
	 public String defangIPaddr(String address) {
		 
		int dot='.';
		String ip =  "[.]";
		StringBuilder sb = new StringBuilder();
		 for(int i=0;i<address.length();i++) {
			 char ch = address.charAt(i);
			 if(ch==dot) {
				 sb.append(ip);
			 }
			 else {
				 sb.append(address.charAt(i));
			 }
		 }
		return sb.toString();
	        
	    }
}