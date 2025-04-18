package com.example.stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class MultiThread {

	public static void main(String[] args) {
		System.out.println("Main thread: "+Thread.currentThread().getName());
		int[] arr = {324,43,54,546,56,45,342,43,546,56,54342,43,232,4,43,4,5,53,54,56,56,43,324};
		CompletableFuture future = CompletableFuture.runAsync(()->{
			List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
			Collections.sort(collect);
			System.out.println(collect);
				System.out.println("Thread1:"+ Arrays.stream(arr).boxed().collect(Collectors.toList()));
		});
		System.out.println("Main Middle: "+Thread.currentThread().getName());
		CompletableFuture future2 = CompletableFuture.runAsync(()->{
				System.out.println("Thread2:"+ Arrays.stream(arr).boxed().collect(Collectors.toList()));
		});
		future2.join();future.join();
		System.out.println("Main Ends: "+Thread.currentThread().getName());
		Vector<Integer> vector = new Vector();
		vector.addElement(null);
	}
	
}
