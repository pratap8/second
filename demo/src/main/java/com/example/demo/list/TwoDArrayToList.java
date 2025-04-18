package com.example.demo.list;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayToList {

	public static void main(String[] args) {
        // Sample 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Convert 2D array to List
        List<Integer> list = new ArrayList<>();
        for (int[] row : array2D) {
            for (int element : row) {
                list.add(element);
            }
        }
        System.out.println(list.get(2));
        for(int b:list) {
        	System.out.print(b+" ");
        }

        // Print the resulting list
        System.out.println("Converted List: " + list);
    }
}
