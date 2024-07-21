package com.example.demo;

public class Higher_Version_Detection {
	
	public static void main(String[] args) {
		Ver ver = new Ver();
		String a= "1111.1112";
		String b= "11.11.1111";
		String f="rrfrrfrr";
		System.out.println(ver.versioning(a,b,f));
	}
}

class Ver{
	public String versioning(String a,String b,String f) {
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>b.charAt(i)) {
				return a;
			}else if(b.charAt(i)>a.charAt(i)) {
				return b;
			}
		}
		return a;
	}
}
