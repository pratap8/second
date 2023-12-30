package com.example.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NonRepeatingchar {

	public static void main(String[] args) {
		NonCharB char1 = new NonCharB();
		NonRep nonRep = new NonRep();
		NonRepChar nonRepChar = new NonRepChar();
		SolutionNonRep solutionNonRep = new SolutionNonRep();
		NonRepLe nonRepLe = new NonRepLe();
		System.out.println(nonRepLe.firstUniqChar("loveleetcode"));
//		System.out.println(solutionNonRep.firstUniqChar("aabb"));
//		System.out.println(nonRepChar.nonRepChar("aabbc"));
//		System.out.println(nonRep.nonRep("aabbc"));
//		System.out.println(char1.NonChar("aabbc"));
	}
}
class NonCharB{
	
	public int NonChar(String a) {
		
		for(int i=0;i<a.length();i++) {
			int b=0;
			for(int j=a.length()-1;j<a.length();j--) {
				if(a.charAt(i)==a.charAt(j)) {
					b++;break;
				}
			}
			if(b==0) {
				return i;
			}
		}
		
		return -1;
	}
}
class NonRep{
	public int nonRep(String a) {
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(a.charAt(c)==a.lastIndexOf(c)) {
				return i;
			}
		}
		return -1;
	}
}
class NonRepChar{
	int nonRepChar(String a) {
		a.toCharArray();
		Map<Character, Integer> b = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			if(b.containsKey(c)) {
				b.put(c, b.get(c)+1);
			}
			else {
				b.put(c, 1);
			}
			
		}
		for(Entry<Character,Integer> d:b.entrySet()) {
			if(d.getValue()==1) {
				System.out.println(d.getKey());
				System.out.println(a.indexOf('c'));
			}
		}
		return -1;
	}
}
class SolutionNonRep {
    public int firstUniqChar(String s) {
        s.toCharArray();
        Map<Character,Integer> a = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(a.containsKey(b)){
                a.put(b, a.get(b)+1);
            }
            else{
                a.put(b,1);
            }
        }
        for(Entry<Character, Integer> c: a.entrySet()){
            if(c.getValue()==1){
                return s.indexOf(c.getKey());
            }
        }
        
        
       return -1;
    }
}
class NonRepLe{
	public int firstUniqChar(String s) {
	    int index = -1;
	    for(char ch : s.toCharArray()) {
	    	System.out.println(s.indexOf(ch)+"  "+s.lastIndexOf(ch));
	        if(s.indexOf(ch) == s.lastIndexOf(ch)) {
	            return s.indexOf(ch);
	        }
	    }

	    return index;
	}
}
