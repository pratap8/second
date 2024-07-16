package com.example.chatGPT;

public class String_length_without_using_inBuilt {

    // Private field to store characters of the string
    private final char[] value;

    // Constructor to initialize a String object
    public String_length_without_using_inBuilt(char[] value) {
        this.value = value;
    }

    // Method to return the length of the string (renamed to length1)
    public int length1() {
        int len = 0;
        // Iterate through the char array until '\0' (null character) is found
        while (value[len] != '\0') {
            len++;
        }
        return len;
    }

    // Main method to test the String_length_without_using_inBuilt class
    public static void main(String[] args) {
        // Example usage with string "pratap"
        String s = "pratap";
        char[] chars = new char[s.length() + 1]; // +1 for null character
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        chars[s.length()] = '\0'; // Add null character at the end

        // Create String_length_without_using_inBuilt object
        String_length_without_using_inBuilt str = new String_length_without_using_inBuilt(chars);

        // Call length1 method to determine the length of the string
        int length = str.length1();

        // Output the length of the string
        System.out.println("Length of string '" + s + "' is: " + length);
    }
}
