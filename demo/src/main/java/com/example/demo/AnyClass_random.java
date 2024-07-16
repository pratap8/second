package com.example.demo;

public class AnyClass_random {

	public static void main(String[] args) {
		int rows = 2; int col=4;
		Checking2MatrixArray checking2MatrixArray = new Checking2MatrixArray();
		int[][] b = checking2MatrixArray.met(rows,col);
		int val = 1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=val;
				System.out.println(val);

				val++;
				}
			}
	}
}


class Checking2MatrixArray{
	
	int[][] met(int rows, int col) {
		int[][] a = new int[rows][col];
		int val=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=val;

				val++;
				}
			}
		return a;
		}
	}
