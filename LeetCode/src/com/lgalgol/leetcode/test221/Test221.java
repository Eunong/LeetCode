package com.lgalgol.leetcode.test221;

// 221. Maximal Square
public class Test221 {

	public static void main(String[] args) {
		char[][] matrix = new char[][]{
			{'1', '0', '1', '0', '0'},
			{'1', '0', '1', '1', '1'},
			{'1', '1', '1', '1', '1'},
			{'1', '0', '1', '1', '1'}
		};
		
		System.out.println(maximalSquare(matrix));
	}

	public static int maximalSquare(char[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int maxLen = 0;
		int dp[][] = new int[matrix.length+1][matrix[0].length+1];
		
		for(int i = 1; i <= matrix.length; i++) {
			for(int j = 1; j <= matrix[0].length; j++) {
				if(matrix[i-1][j-1] == '1') {
					dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
					maxLen = Math.max(maxLen, dp[i][j]);
				}
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return maxLen*maxLen;
	}
}
