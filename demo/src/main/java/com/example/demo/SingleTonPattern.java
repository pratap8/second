package com.example.demo;

public class SingleTonPattern {

	public static SingleTonPattern val = null;
	
	private SingleTonPattern() {
		
	}
	public static SingleTonPattern getInstance() {
		if(val==null) {
			val = new SingleTonPattern();
		}
		return val;
	}
	
}
