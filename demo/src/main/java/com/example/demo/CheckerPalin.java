package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CheckerPalin {
	 public static void main(String[] args) {
	        String[] strings = {"racecar", "hello", "level", "world", "radar", "java"};
	        List<String> nonPalindromes = getNonPalindromes(strings);
	        
//	        System.out.println("Non-palindrome strings: " + nonPalindromes);
	        palinInt intPalin = new palinInt();
	        System.out.println(intPalin.intPalin1());
	    }

	    public static List<String> getNonPalindromes(String[] strings) {
	        List<String> nonPalindromes = new ArrayList<>();

	        for (String str : strings) {
	            if (!isPalindrome(str)) {
	                nonPalindromes.add(str);
	            }
	        }

	        return nonPalindromes;
	    }

	    public static boolean isPalindrome(String str) {
	        int length = getLength(str);
	        int left = 0;
	        int right = length - 1;

	        while (left < right) {
	            if (manualCharAt(str, left) != manualCharAt(str, right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static int getLength(String str) {
	        int length = 0;
	        try {
	            while (true) {
	                manualCharAt(str, length);
	                length++;
	            }
	        } catch (IndexOutOfBoundsException e) {
	            // End of string reached
	        }
	        return length;
	    }

	    public static char manualCharAt(String str, int index) {
	        char[] chars = str.toCharArray();
	        char result = '\0';
	        int count = 0;
	        
	        for (char c : chars) {
	            if (count == index) {
	                result = c;
	                break;
	            }
	            count++;
	        }
	        
	        if (result == '\0') {
	            throw new IndexOutOfBoundsException("Index out of bounds");
	        }
	        
	        return result;
	    }
	}

class palinInt{
	public boolean intPalin1() {
		int i=121,k=i;
		int reverse=0;
		while(i>0) {
			reverse=i%10+reverse*10;
			i=i/10;
			System.out.println(reverse);
		}
		if(reverse==k) {
			return true;
		}
		return false;
	}
}