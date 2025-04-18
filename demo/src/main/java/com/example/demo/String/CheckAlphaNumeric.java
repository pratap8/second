package com.example.demo.String;

public class CheckAlphaNumeric {

	public static void main(String[] args) {
		String alpha="asdQWEDSds";
		System.out.println(checkAlpha(alpha.toLowerCase()));
	}
	
	static boolean checkAlpha(String alpha) {
		boolean check=true;
		char[] charArray = alpha.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			int z=0;
			for(int j=97;j<=123;j++) {
				if((char)j==charArray[i]) {
					z++;
				}
			}
			if(z==0) {
				return false;
			}
		}
		return check;
	}
}
