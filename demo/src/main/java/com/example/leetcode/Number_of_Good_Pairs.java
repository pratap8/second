package com.example.leetcode;

public class Number_of_Good_Pairs {
public static void main(String[] args) {
	SolutionGood good = new SolutionGood();
	String b = "Abcdefgh";
	
	int []a= {1,1,1,1};
	System.out.println(good.numIdenticalPairs(a));
}
}
class SolutionGood {
    public int numIdenticalPairs(int[] A) {
    int ans = 0, cnt[] = new int[101];
    for (int a: A) {
//        ans += cnt[a]++;
        ans = ans+cnt[a]++;
    }
    return ans;
}
}
