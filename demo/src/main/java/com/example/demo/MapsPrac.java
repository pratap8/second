package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MapsPrac {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));
		hm.put("e", new Integer(500));
		
		System.out.println(hm.get("a"));
		for(Map.Entry<String, Integer> c: hm.entrySet()) {
			System.out.println(c.getKey()+" "+c.getValue());
		}
	}
}
