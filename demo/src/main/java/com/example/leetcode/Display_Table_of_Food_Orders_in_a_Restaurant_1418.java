package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Display_Table_of_Food_Orders_in_a_Restaurant_1418 {

	public static void main(String[] args) {
		 List<List<String>> orders = Arrays.asList(
		            Arrays.asList("David", "3", "Ceviche"),
		            Arrays.asList("Corina", "10", "Beef Burrito"),
		            Arrays.asList("David", "3", "Fried Chicken"),
		            Arrays.asList("Carla", "5", "Water"),
		            Arrays.asList("Carla", "5", "Ceviche"),
		            Arrays.asList("Rous", "3", "Ceviche")
		        );

//        getOrders(orders);
        displayTable(orders);
	}
	static void getOrders(List<List<String>> order) {
		List<String> first=new ArrayList<String>();
		List<String> tabler=new ArrayList<String>();
		List<String> dishes=new ArrayList<String>();
		first.add("Table");
		HashMap<String, Integer> menu = new HashMap<String, Integer>();
		HashMap<String, Integer> tables = new HashMap<String, Integer>();
		HashMap<String, Integer> dish = new HashMap<String, Integer>();
		Map<String, Map<String, Integer>> deliver = new HashMap<String, Map<String,Integer>>();
		
		for(List<String> orders:order) {
			menu.put(orders.get(2), menu.getOrDefault(orders.get(2), 0)+1);
			tables.put(orders.get(1), tables.getOrDefault(orders.get(1), 0)+1);
		}
		for(Entry<String, Integer> aa:menu.entrySet()) {
			first.add(aa.getKey());
		}
		for(Entry<String, Integer> aa:tables.entrySet()) {
			tabler.add(aa.getKey());
		}
		
		System.out.println(first);
		System.out.println(tabler);
	}
	static void displayTable(List<List<String>> orders) {
        // Map to hold table numbers and their corresponding dish counts
        Map<String, Map<String, Integer>> tableOrders = new HashMap<>();
        Set<String> dishes = new TreeSet<>(); // To keep track of unique dishes

        // Process each order
        for (List<String> order : orders) {
            String name = order.get(0);
            String table = order.get(1);
            String dish = order.get(2);

            // Add dish to the set of dishes
            dishes.add(dish);

            // Update the table's order count
            tableOrders.putIfAbsent(table, new HashMap<>());
            tableOrders.get(table).put(dish, tableOrders.get(table).getOrDefault(dish, 0) + 1);
        }
        // Prepare the header row
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(dishes);

        // Prepare the result list with header
        List<List<String>> result = new ArrayList<>();
        result.add(header);
        List<String> sortedTables = new ArrayList<>(tableOrders.keySet());
        Collections.sort(sortedTables);

        for (String table : sortedTables) {
            List<String> row = new ArrayList<>();
            row.add(table); // Add table number

            for (String dish : dishes) {
                row.add(String.valueOf(tableOrders.get(table).getOrDefault(dish, 0))); // Add count of each dish
            }

            result.add(row);
        }

        System.out.println(result);

	}
}
