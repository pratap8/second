package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashPrac {

	public static void main(String[] args) {
		String a="qqwwweeeerrrrrr";
		char[] b=a.toCharArray();
		Map<Character, Integer> c = new HashMap<Character, Integer>();
		
//		for(char d:b) {
//			if(c.containsKey(d)) {
//				c.put(d, c.get(d)+1);
//			}else {
//				
//				c.put(d, 1);
//			}
//		} 
//		for(Map.Entry<Character, Integer> qq:c.entrySet() ) {
//			System.out.println(qq.getKey()+"   "+qq.getValue());
//		}
		Hasher hasher = new Hasher();
		hasher.hashing();
	}
}
class Hasher{
	public void hashing() {
		String name="phool babu raj pratap singh";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++) {
			if(map.containsKey(name.charAt(i))) {
				map.put(name.charAt(i), map.get(name.charAt(i))+1);
			}else {
				map.put(name.charAt(i), 1);
			}
		}
	}
}

