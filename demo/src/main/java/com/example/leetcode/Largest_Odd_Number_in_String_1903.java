package com.example.leetcode;

public class Largest_Odd_Number_in_String_1903 {

	public static void main(String[] args) {
		oddNumb numb = new oddNumb();
		System.out.println(numb.largestOddNumberChar("7542351161"));
	}
}
class oddNumb {
    public String largestOddNumber(String num) {
        long numb=Integer.parseInt(num);
        if(numb%2!=0) {
        	return String.valueOf(numb);
        }
        while(numb>0) {
        	numb/=10;
        	if(numb%2!=0) {
        		return String.valueOf(numb);
        	}
        }
        return "";
    }
    public String largestOddNumberChar(String num) {
        for(int i=num.length()-1;i>=0;i--) {
        	if(Character.getNumericValue(num.charAt(i))%2==1) {
        		return num.substring(0,i+1);
        	}
        }
        return "";
    }
}
