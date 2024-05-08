package com.example.leetcode;

public class HappyNumber {
	public static void main(String[] args) {
		SolHappy happy = new SolHappy();
		System.out.println(happy.isHappy(19));
	}
}

class SolHappy {
	public boolean isHappy(int n) {
		int temp;
		int temp1=0;
		int count=0;
		while(n>0) {
			
			temp= temp1+(n%10)*(n%10);
			n=n/10;
			temp1=temp;
			System.out.println(temp);
			if(n==0 && temp==1) {
				return true;
			}
			
			else if(n==0 && temp<10 && count>0) {
				return false;
			}
			else if(n==0) {
				n= temp;
				temp1=0;
				count++;
			}
		}
		return false;
		
		
		

	}
}
