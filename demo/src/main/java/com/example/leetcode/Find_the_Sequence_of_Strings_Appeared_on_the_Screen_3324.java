package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_the_Sequence_of_Strings_Appeared_on_the_Screen_3324 {

	public static void main(String[] args) {
		Find_the_Sequence_of_Strings_Appeared_on_the_Screen_3324 chara = new Find_the_Sequence_of_Strings_Appeared_on_the_Screen_3324();
		System.out.println(chara.stringSequence("bcab"));
	}
	public List<String> stringSequence(String target) {
       List<String> scala = new ArrayList<String>();
       StringBuilder builder = new StringBuilder();
       for(int i=0;i<target.length();i++) {
    	   if(i==0) {
    		   for(char c='a';c<=target.charAt(i);c++) {
    			   scala.add(String.valueOf(c));
    		   }
    	   }
    	   else {
    		   builder.append(target.charAt(i-1));
    		   StringBuilder builder1 = new StringBuilder(builder);
    		   for(char c='a';c<=target.charAt(i);c++) {
    			   scala.add(builder1.toString()+c);
    		   }
    		   
    	   }
       }
       
       return scala;
    }
}
