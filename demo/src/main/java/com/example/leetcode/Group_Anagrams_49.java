package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group_Anagrams_49 {

	public static void main(String[] args) {
		Group_Anagrams_49 anagram= new Group_Anagrams_49();
		String[] value= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagram.groupAnagrams(value));
	}
	public List<List<String>> groupAnagrams(String[] strs) {
    	String [] c = new String[strs.length];
        int count=0;
        for(String s:strs){
        	char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String a=new String(chars);
            c[count]=a;
            count++;
        }
    	List<List<String>> b = new ArrayList<List<String>>();
    	
        for(int i=0;i<c.length;i++){
            List<String> value = new ArrayList();
            count=0;
            if(strs[i]!="-1") {
            	count++;
            	value.add(strs[i]);
            }
            for(int j=i+1;j<c.length;j++){
                if(c[i].equals(c[j]) && strs[j]!="-1"){
                    value.add(strs[j]);
                    strs[j]="-1";
                }
            }
            if(count>0) {
            	b.add(value);
            }
            
        }
        return b;
        }
}
