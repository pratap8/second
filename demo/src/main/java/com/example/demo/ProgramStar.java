package com.example.demo;

public class ProgramStar {

	public static void main(String[] args) {
		PrintHeaderStar headerStar = new PrintHeaderStar();
		headerStar.StartPrint("Program");
	}
}

class PrintHeaderStar{
	
	void StartPrint(String name) {
		int iLength=0;
		int jLength=name.length();
		int i,j;
		for(i=0;i<=name.length();i++) {
			for(j=0;j<=name.length();j--) {
				if(iLength == i) {
					System.out.print(name.charAt(i));
					iLength++;
					if(i>name.length()/2) {
						break;
					}
				}
				else if(jLength== j) {
					System.out.print(name.charAt(j));
					jLength--;
					if(j>name.length()/2) {
						break;
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}