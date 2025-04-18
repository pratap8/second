package com.example.leetcodeContest;

import java.util.TreeSet;

//Example 1:
//
//Input: queries = [[1,2],[2,4]]
//
//Output: 3
//
//Explanation:
//
//For queries[0]:
//
//The initial array is nums = [1, 2].
//In the first operation, select nums[0] and nums[1]. The array becomes [0, 0].
//The minimum number of operations required is 1.
//For queries[1]:
//
//The initial array is nums = [2, 3, 4].
//In the first operation, select nums[0] and nums[2]. The array becomes [0, 3, 1].
//In the second operation, select nums[1] and nums[2]. The array becomes [0, 0, 0].
//The minimum number of operations required is 2.
//The output is 1 + 2 = 3.
//
//Example 2:
//
//Input: queries = [[2,6]]
//
//Output: 4
//
//Explanation:
//
//For queries[0]:
//
//The initial array is nums = [2, 3, 4, 5, 6].
//In the first operation, select nums[0] and nums[3]. The array becomes [0, 3, 4, 1, 6].
//In the second operation, select nums[2] and nums[4]. The array becomes [0, 3, 1, 1, 1].
//In the third operation, select nums[1] and nums[2]. The array becomes [0, 0, 0, 1, 1].
//In the fourth operation, select nums[3] and nums[4]. The array becomes [0, 0, 0, 0, 0].
//The minimum number of operations required is 4.
//The output is 4.
public class Minimum_Operations_to_Make_Array_Elements_Zero_100559 {
	public static void main(String[] args) {
		int[][] queries= {{2,6}};
		System.out.println(minOperations(queries));
	}
	public static long minOperations(int[][] queries) {
        TreeSet<Integer> aa=new TreeSet<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<queries[i].length;j++){
                aa.add(queries[i][j]);
            }
        }
        int min=0,max=0,size=1;
        for(Integer value: aa){
            if(min==0){
                min=value;
              
            }
            if(size==aa.size()){
                max=value;
            }
            size++;
        }
        int count=0;
        for(int i=min;i<=max;i++){
            count++;
        }
        return count;
    }
}
