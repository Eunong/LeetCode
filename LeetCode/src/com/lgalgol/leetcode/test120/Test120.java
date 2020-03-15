package com.lgalgol.leetcode.test120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test120 {

	public static void main(String[] args) {
		// test data
		List<List<Integer>> triangle = new ArrayList<>();

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();

		list1.add(2);
		list2.add(3);
		list2.add(4);
		list3.add(6);
		list3.add(5);
		list3.add(7);
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);

		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);

		// [2],
		// [3,4],
		// [6,5,7],
		// [4,1,8,3]

		System.out.println(minimumTotal(triangle));
	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		int[] dp = new int[triangle.size() + 1];
		
		for(int i = triangle.size()-1; i >= 0; i--) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
			}
		}
		
		return dp[0];
	}
}
