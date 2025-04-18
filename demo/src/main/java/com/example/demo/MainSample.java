package com.example.demo;
import java.util.*;
import java.io.*;

public class MainSample {
	    public static List<String> processData(ArrayList<String> lines) {
	        Map<String, Integer> maxPriceMap = new HashMap<>();
	        List<String[]> transactions = new ArrayList<>();
	        Map<String, Set<String>> customerDiscountedItems = new HashMap<>();
	        Map<String, Set<String>> customerAllItems = new HashMap<>();

	        for (String line : lines) {
	            String[] parts = line.split(", ");
	            String product = parts[3];
	            int price = Integer.parseInt(parts[4].substring(3));

	            maxPriceMap.put(product, Math.max(maxPriceMap.getOrDefault(product, 0), price));
	            transactions.add(parts);
	        }

	        for (String[] transaction : transactions) {
	            String customer = transaction[0];
	            String product = transaction[3];
	            int price = Integer.parseInt(transaction[4].substring(3));

	            customerAllItems.putIfAbsent(customer, new HashSet<>());
	            customerAllItems.get(customer).add(product);

	            if (price < maxPriceMap.get(product)) {
	                customerDiscountedItems.putIfAbsent(customer, new HashSet<>());
	                customerDiscountedItems.get(customer).add(product);
	            }
	        }

	        List<String> result = new ArrayList<>();
	        for (String customer : customerDiscountedItems.keySet()) {
	            if (customerAllItems.get(customer).equals(customerDiscountedItems.get(customer))) {
	                result.add(customer);
	            }
	        }

	        Collections.sort(result);
	        return result;
	    }

	    public static void main(String[] args) {
	        ArrayList<String> inputData = new ArrayList<>(Arrays.asList(
	            "Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash",
	            "Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card",
	            "Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash",
	            "Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card",
	            "T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card",
	            "Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card",
	            "Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card",
	            "Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI",
	            "Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash",
	            "Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI",
	            "Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI"
	        ));

	        List<String> retVal = processData(inputData);
	        for (String str : retVal)
	            System.out.println(str);
	    }
	}
