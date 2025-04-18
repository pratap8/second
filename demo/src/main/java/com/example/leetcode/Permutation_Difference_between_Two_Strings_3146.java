package com.example.leetcode;

public class Permutation_Difference_between_Two_Strings_3146 {

	public static void main(String[] args) {
		String s="rwohu",t="rwuoh";
		char[] s1 = s.toCharArray();
		char[] t1= t.toCharArray();
		int temp=0;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<t1.length;j++) {
            	if(s1[i]==t1[j]) {
            		
            		if(j>i) {
            			temp=j-i+temp;
            		}else {
            			temp=i-j+temp;
            		}
            	}
            }
        }
        System.out.println(temp);
	}
}
