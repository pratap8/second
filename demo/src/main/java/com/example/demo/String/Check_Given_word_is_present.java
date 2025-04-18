package com.example.demo.String;

import java.util.Arrays;

public class Check_Given_word_is_present {

	public static void main(String[] args) {
        String word="Tell me about your self";
        String wordly="me";
//        String[] words=word.split(" ");
//        for(String letter:words) {
//        	if(wordly.equals(letter)) {
//        		System.out.println(wordly+" is present in the sentence");
//        		System.exit(0);
//        	}
//        }
//        System.out.println(wordly+" is not present");
        
        if(Arrays.asList(word.split(" ")).contains(wordly)) {
        	System.out.println("is present");
        }else {
        	System.out.println("not present");
        }
	}
}
