package com.lgalgol.leetcode.test96;

public class Test96 {

	// 96. Unique Binary Search Trees
	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}

	public static int numTrees(int n) {
		int[] dp = new int[n + 1];

		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] += dp[j - 1] * dp[i - j];
			}
		}
		return dp[n];
	}
}
