package com.lgalgol.leetcode.test279;

import java.util.Arrays;

// 279. Perfect Squares
public class Test279 {

	public static void main(String[] args) {
		System.out.println(numSquares(5));
		System.out.println(numSquares(12));
		System.out.println(numSquares(13));
	}

	public static int numSquares(int n) {
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
//				System.out.println(i + ", " + j + " : " + dp[i]);
			}
		}
		
		return dp[n];
	}

}
