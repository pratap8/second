package com.example.demo;
import java.util.*;
public class Main2Sample {
	    public static List<String> processData(ArrayList<String> lines) {
	        // Map to store the maximum price for each product
	        Map<String, Integer> maxProductPrices = new HashMap<>();
	        
	        // Map to store customer purchases
	        Map<String, List<Integer>> customerPurchases = new HashMap<>();
	        
	        // Process each line to populate the above maps
	        for (String line : lines) {
	            String[] parts = line.split(", ");
	            String customerName = parts[0];
	            String productName = parts[3];
	            int price = Integer.parseInt(parts[4].substring(3)); // Remove "Rs " and parse to int
	            
	            // Update the maximum price for the product
	            maxProductPrices.put(productName, Math.max(maxProductPrices.getOrDefault(productName, 0), price));
	            
	            // Record the purchase for the customer
	            if (!customerPurchases.containsKey(customerName)) {
	                customerPurchases.put(customerName, new ArrayList<>());
	            }
	            customerPurchases.get(customerName).add(price);
	        }
	        
	        // List to store customers who always bought at a discount
	        List<String> discountCustomers = new ArrayList<>();
	        
	        // Check each customer's purchases
	        for (Map.Entry<String, List<Integer>> entry : customerPurchases.entrySet()) {
	            String customerName = entry.getKey();
	            List<Integer> purchases = entry.getValue();
	            boolean alwaysDiscounted = true;
	            
	            for (int i = 0; i < purchases.size(); i++) {
	                String productName = lines.get(i).split(", ")[3];
	                int maxPrice = maxProductPrices.get(productName);
	                if (purchases.get(i) >= maxPrice) {
	                    alwaysDiscounted = false;
	                    break;
	                }
	            }
	            
	            if (alwaysDiscounted) {
	                discountCustomers.add(customerName);
	            }
	        }
	        
	        return discountCustomers;
	    }

	    public static void main(String[] args) {
	        // Hardcoded input data
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
	        
	        // Process the input data
	        List<String> retVal = processData(inputData);
	        
	        // Print the output
	        for (String str : retVal) {
	            System.out.println(str);
	        }
	    }
	}