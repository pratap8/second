package com.example.demo;

import java.util.PriorityQueue;

public class HeapPrac {

	public static void main(String[] args) {
		HeapPrac heapPrac = new HeapPrac();
		int[][] value= {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
		 int[][] result =heapPrac.kClosest(value, 2);
		for (int[] point : result) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }
	}
	public int[][] kClosest(int[][] points, int k) {
        // Your code here

        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1])
        );

        // Add all points to the heap
        for (int[] point : points) {
            heap.offer(point);
        }

        // Extract the k closest points
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
