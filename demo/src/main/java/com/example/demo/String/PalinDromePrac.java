package com.example.demo.String;

public class PalinDromePrac {

	public static void main(String[] args) {
		String word="qweeawq";
		printWord(word);
	}
	static void printWord(String word) {
		int j=word.length();
		int k=0;
		for(int i=0;i<word.length();i++,j--) {
			if(word.charAt(i)==word.charAt(j-1)) {
				continue;
			}else {
				k++;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(k==0) {
			System.out.println("palindomre");
		}
		
	}
}
