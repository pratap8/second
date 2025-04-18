package com.example.demo;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static List<String> processData(ArrayList<String> lines) {
        Map<String, Integer> maxPriceMap = new HashMap<>(); // Stores max price of each product
        List<String[]> transactions = new ArrayList<>(); // Stores parsed transactions
        Map<String, Set<String>> customerDiscountedItems = new HashMap<>(); // Stores discounted items per customer
        Map<String, Set<String>> customerAllItems = new HashMap<>(); // Stores all items per customer

        // Parse input and determine max price per product
        for (String line : lines) {
            String[] parts = line.split(", ");
            String product = parts[3];
            int price = Integer.parseInt(parts[4].substring(3)); // Remove "Rs " and convert to int

            maxPriceMap.put(product, Math.max(maxPriceMap.getOrDefault(product, 0), price));
            transactions.add(parts);
        }

        // Identify discounted purchases
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

        Collections.sort(result); // Sort the output in case-sensitive lexicographical order
        return result;
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
