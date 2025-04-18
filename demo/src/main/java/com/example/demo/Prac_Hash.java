package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prac_Hash {

	private static Prac_Hash instance=null;
	
	private Prac_Hash() {
		
	}
	public static Prac_Hash getInstance() {
		if(instance==null) {
			instance=new Prac_Hash();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Prac_Hash x= getInstance();
		Prac_Hash y= getInstance();
		if(x==y) {
			System.out.println("Same reference");
		}else {
			System.out.println("Different");
		}
	}
	
}
