package com.example.leetcode;

public class Sort_Vowels_in_a_String {

	public static void main(String[] args) {
		SolutionSortVowel vowel = new SolutionSortVowel();
		System.out.println(vowel.sortVowels("lEetcOde"));
	}
}

class SolutionSortVowel {
    public String sortVowels(String s) {
        char[] a= {'A','E','I','O','U','a','e','i','o','u'};
       
        String e = "";
        char[] b=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<a.length;j++){
            	if(b[i]==a[j]) {
            		e+=a[j];
            		a[j]=b[i];
            		break;
            	}
            	else if(j == a.length-2){
            		e+=b[i];
            		break;
            	}
				
            }
            System.out.println(e);
        }
        return e;
    }
}