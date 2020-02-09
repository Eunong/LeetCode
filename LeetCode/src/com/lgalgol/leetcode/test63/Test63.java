package com.lgalgol.leetcode.test63;

public class Test63 {

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		
		System.out.println(uniquePathsWithObstacles(grid));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;
		
		int dp[][] = new int[row+1][col+1];
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				if(obstacleGrid[i-1][j-1] == 1) {
					dp[i][j] = 0;
					continue;
				}
				if(i==1 && j==1) {
					dp[i][j] = 1;
					continue;
				}
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
//				System.out.println(i + ", " + j + " = " + dp[i][j]);
			}
		}
		
		return dp[row][col];

	}
}
