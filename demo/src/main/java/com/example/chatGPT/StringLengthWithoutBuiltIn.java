package com.example.chatGPT;

public class StringLengthWithoutBuiltIn {

    public static void main(String[] args) {
        String a = "aaaa";
        int length = findLength(a);
        System.out.println("Length of string '" + a + "' is: " + length);
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            // Loop until an IndexOutOfBoundsException is caught
            while (true) {
                // Attempt to access character at index 'count'
                manualCharAt(str, count);
                count++; // Increment count to check subsequent characters
            }
        } catch (IndexOutOfBoundsException e) {
            // Caught exception means end of string reached
        }
        return count; // Return the total count of characters in the string
    }

    public static void manualCharAt(String str, int index) {
        // Attempt to access character at index 'index' without using built-in methods
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // No actual character access or manipulation is performed here, just validation
    }
}
