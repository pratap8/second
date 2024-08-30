package com.example.demo;

import org.slf4j.Logger;

public class RunnablePrac {

	
	public static void main(String[] args) {
		practiseRunnable runnable = new practiseRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
class practiseRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnable");
	}
	
}