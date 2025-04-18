package com.example.AsyncPrac;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncPrac {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService executor = Executors.newFixedThreadPool(10);
//		Future<Integer> future1 = executor.submit(()->{
//			Thread.sleep(5000);
//			return 2000;
//		});
//		
//		Future<Integer> future2 = executor.submit(()->{
//			Thread.sleep(2000);
//			return 2000;
//		});
		String a=new String("Pratap");
		String b=new String("Pratap");
		System.out.println(a+" "+b);
		
		
		
		
	}
}
