package com.example.demo.recursive;

public class Mean_of_array_using_recursion {

	public static void main(String[] args) {
		 int A[] = {1, 2, 3, 4, 5}; 
	        int N = A.length; 
	        System.out.println(findMean(A, N)); 
	}
	 static int findMean(int A[], int N) {
		 if(N==1) {
			 return A[N-1];
		 }
		 return findMean(A,N-1)+A[N-1];
	 }
}
