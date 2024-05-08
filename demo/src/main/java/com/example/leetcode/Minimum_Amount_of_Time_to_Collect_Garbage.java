package com.example.leetcode;

public class Minimum_Amount_of_Time_to_Collect_Garbage {

	public static void main(String[] args) {
		SolutionGarbage garbage = new SolutionGarbage();
		String[] garbage1= {"G","P","GP","GG"};
		int[] travel =  {2,4,3};
		System.out.println(garbage.garbageCollection(garbage1, travel));
	}
}

class SolutionGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int i=0;
        int count=0;
        String[] metal = {"M" , "P","G"};
        char[] metal1 = {'M' , 'P','G'};
        while(i< metal.length) {
        	System.out.println("i= "+i);
        	for(int j=0;j<garbage.length;j++) {
        		if(garbage[j].contains(metal[i])) {
        			char []b = garbage[j].toCharArray();
        			for(int z=0;z<b.length;z++) {
        				if(b[z] == metal1[i]) {
        					
        					count++;
        					System.out.println(" second if count= "+count);
        				}
        			}
        		}
        	}
        	i++;
        }
    	
    	
    	
    	
    	return i;
    }
}