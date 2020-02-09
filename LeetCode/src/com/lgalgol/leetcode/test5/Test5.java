package com.lgalgol.leetcode.test5;

public class Test5 {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}

	public static String longestPalindrome(String s) {
		String rslt = "";
		
		boolean dp[][] = new boolean[s.length()][s.length()];
		
        for(int i = 0; i < s.length(); i++) {
        	for(int j = i; j >= 0; j--) {
        		if(s.charAt(i) == s.charAt(j) && (i-j < 2 || dp[j+1][i-1])) {
        			dp[j][i] = true;
        			if(rslt.length() == 0 || i-j+1 > rslt.length()) {
        				rslt = s.substring(j, i+1);
        			}
        		}
        	}
        }
		
		return rslt;
	}
}
