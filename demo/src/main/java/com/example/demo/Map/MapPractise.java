package com.example.demo.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapPractise {

	public static void main(String[] args) {
//		 HashMap<String, String> capitalCities = new HashMap();
//		 TreeMap<String, String> capitalCities = new TreeMap<String, String>();
		 LinkedHashMap<Integer,Integer> your = new LinkedHashMap();
		 your.put(1, 1);
		 your.put(1, 2);
		 your.put(2, 2);
		 your.put(3, 3);
//		    capitalCities.put("England", "London");
//		    capitalCities.put("Germany", "Berlin");
//		    capitalCities.put("England", "Oslo");
//		    capitalCities.put("USA", "Washington DC");
		    
		    for (int i : your.values()) {
		      System.out.println(i);
		    }
	}
}
