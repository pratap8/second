package com.example.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		SolutionFirst first= new SolutionFirst();
		NonCharA char1 = new NonCharA();
//		System.out.println(first.firstUniqChar("aacc"));
		System.out.println(char1.non("kaabcdbe"));
	}
}
class SolutionFirst {
    public int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++){
            int a=0;
            for(int j=i+1;j<s.length();j++){
                   if(s.charAt(i)==s.charAt(j)) {
                	   s= s.substring(i,j)+'0'+s.substring(i+1);
                	   a++;
                	   break;
                   }
                }
            if(a==0 && s.charAt(i)!=0){
            	System.out.println(s);
                return i;
            }
        }
    
     return -1;
        }
       
    }

class NonCharA{
	int non(String a) {
		Map<Character, Integer> c=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if(c.containsKey(ch)) {
				c.put(ch, c.get(ch)+1);
			}
			else {
				c.put(ch, 1);
			}
			
			
		}

		for(Entry<Character, Integer> cir: c.entrySet()) {
			if(cir.getValue()==1) {
				System.out.println(cir.getKey());
				break;
			}
		}
		return -1;
	}
}