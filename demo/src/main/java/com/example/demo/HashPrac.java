package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashPrac {

	public static void main(String[] args) {
		String key="the quick brown fox jumps over the lazy dog";
		String message="vkbs bs t suepuv";
		key = key.replaceAll(" ", "");
		char ch1 = 'a';
		String a = "";
		HashMap<Character,Character> hash = new HashMap<Character,Character>();
		for(int i=0;i<key.length();i++) {
			if(!hash.containsValue(key.charAt(i))) {
				hash.put(ch1, key.charAt(i));
//				System.out.println(ch1+" -> "+key.charAt(i));
				ch1++;
		}
		}
		System.out.println(hash);
		for(int i=0;i<message.length();i++) {
			if(message.charAt(i) != ' ') {
			a+= hash.get(message.charAt(i));
			
			System.out.println(a);
		}else {
			a+= ' ';
		}
			
	}
	}
}
