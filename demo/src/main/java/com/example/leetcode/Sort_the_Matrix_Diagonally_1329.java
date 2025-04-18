package com.example.leetcode;

import java.util.Arrays;
import java.util.TreeMap;

public class Sort_the_Matrix_Diagonally_1329 {

	public static void main(String[] args) {
		int[][] mat= {{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};

		System.out.println(diagonalSort(mat));
	}
	 public static int[][] diagonalSort(int[][] mat) {
	       	int[] combine = new int[mat[0].length*mat.length];
	       	int k=0;
	       	for(int i=0;i<mat.length;i++) {
	       		for(int j=0;j<mat[0].length;j++) {
	       			combine[k]=mat[i][j];
	       			k++;
	       		}
	       	}
	       	Arrays.sort(combine);
	       	k=0;
	       	for(int i=0;i<mat.length;i++) {
	       		for(int j=0;j<mat[0].length;j++) {
	       			mat[i][j]=combine[k];
	       			k++;
	       		}
	       	}
	       	return mat;
	    }
}
