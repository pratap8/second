package com.example.demo;

import java.util.stream.IntStream;

import org.yaml.snakeyaml.util.ArrayUtils;

public class MissingNumb {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		int []a = {5,2,3,1};
		solution.missingNumber(a, 5);
	}
}
class Solution1 {
    int missingNumber(int array[], int n) {
        // Your Code Here
    	
    	for(int i=1;i<=n;i++) {
    		int a=1;
    		for(int j=1;j<=n;j++) {
    			if(array[i-1]==j) {
    				a++;
    			}
    			}
    		if(a==1) {
    			System.out.println(i);
    			break;
    		}
    	}
    	return 0;
        
    }
}