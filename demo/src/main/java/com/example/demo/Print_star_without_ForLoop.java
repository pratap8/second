package com.example.demo;

public class Print_star_without_ForLoop {

	public static void main(String[] args) {
		LeftAngleTri angleTri = new LeftAngleTri();
		RightAngleTri angleTri2 = new RightAngleTri();
		Pyramid pyramid = new Pyramid();
//		angleTri.leftTri(5);
//		angleTri2.rightTri(5);
//		pyramid.pyramid(5);
		leftWithoutLoop.printPattern(5);

	}
}
class LeftAngleTri{
	public void leftTri(int height) {
		for(int i=1;i<height+1;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
class RightAngleTri{
	public void rightTri(int height) {
		int i=height;
		for(int row=1;row<=height;row++) {
			for(int col=1;col<=height;col++) {
				if(col<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
					
				}
			}
			System.out.println();
			i--;
		}
	}
}
class Pyramid{
	public void pyramid(int height) {
		int i=height;
		for(int row=1;row<=height;row++) {
			for(int col=1;col<=height;col++) {
				if(col<i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
					
				}
			}
			System.out.println();
			i--;
		}
	}
}
class leftWithoutLoop{
	 static void printPattern(int n) {
	        if (n > 0) {
	            printPattern(n - 1); // Recursive call for the previous row
	            printStars(n); // Print stars for the current row
	            System.out.println(); // Move to the next line
	        }
	    }

	    static void printStars(int n) {
	        if (n > 0) {
	            System.out.print("* ");
	            printStars(n - 1); // Recursive call for the remaining stars in the row
	        }
	    }
}

class RightWithoutLoop{
	static void RightPrint(int header) {
		if(header>0) {
			
		}
	}
	static void printer(int n) {
		
	}
}