package com.example.demo;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class MAIN2 {
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

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}