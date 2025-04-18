package com.example.leetcode;

import java.util.Arrays;

public class Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful_2914 {

	public static void main(String[] args) {
		String s="110";
		System.out.println(print(s));
	}
	static int print(String s) {
		char[] word = s.toCharArray();
        Arrays.sort(word);
        StringBuilder builder = new StringBuilder();
        builder.append(word);
        int size1=builder.lastIndexOf("0")+1;
        int size2 =builder.lastIndexOf("1")+1-size1;
        if(size1<=0 ||size2<=0) {
        	return 0;
        }
        if(size1==1 && size2==1) {
        	return 1;
        }
        int count=0;
        if(size1%2==0 || size1==1) {
        	count=count+1;
        }else {
        	count=count+2;
        }
        if(size2%2==0 || size2==1) {
        	count=count+1;
        }else {
        	count=count+2;
        }
        return count;
	}
}
