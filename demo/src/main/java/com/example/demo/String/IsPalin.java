package com.example.demo.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class IsPalin {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Main started: "+Thread.currentThread().getName());
		CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
			System.out.println("future started: "+Thread.currentThread().getName());
			try {
			Thread thread = new Thread();
			thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("future ended: "+Thread.currentThread().getName());
		});
		CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
			System.out.println("future1 started: "+Thread.currentThread().getName());
			try {
			Thread thread = new Thread();
			thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("future1 ended: "+Thread.currentThread().getName());
		});
		 // Combining futures
        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future,future1);
        combinedFuture.get();
		System.out.println("Main ended");

	}

	static void badError() {
		throw new Error();
	}

	static void getPalin(String a) {
		List<Integer> al = Arrays.asList(1, 3, 2, 4, 3, 1, 2);
		al.stream().distinct();
		Set<Integer> al1 = new HashSet<Integer>();
		for (int i = 0; i < al.size(); i++) {
			al1.add(al.get(i));
		}
		List<Integer> al2 = al1.stream().collect(Collectors.toList());
		Collections.reverse(al2);
		System.out.println(al2);
	}

	public void hello() {
		System.out.println("aa");
	}
}

interface caller {
	public static void hello() {
		System.out.println("aa");
	}

}
