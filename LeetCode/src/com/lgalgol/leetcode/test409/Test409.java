package com.lgalgol.leetcode.test409;

// 409. Longest Palindrome
public class Test409 {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("bananas"));
		System.out.println(longestPalindrome("abccccdd"));
		System.out.println(longestPalindrome("cacc"));
	}

	public static int longestPalindrome(String s) {
		int[] count = new int[123];
		int length = 0;
        for(char c: s.toCharArray()){
            if(++count[c] == 2){
                length += 2;
                count[c] = 0;
            }
        }
        return (length == s.length()) ? length: length+1;
	}
	
}
