package com.lgalgol.leetcode.test62;

public class Test62 {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 2));
		System.out.println(uniquePaths(7, 3));
	}

	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[n+1][m+1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i==1 && j==1) {
					dp[i][j] = 1;
					continue;
				}
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
//				System.out.println(i + ", "+ j + " = " + dp[i][j]);
			}
		}
		return dp[n][m];
	}
}
