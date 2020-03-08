package com.lgalgol.leetcode.test345;

public class Test345 {

	// 345. Reverse Vowels of a String
	public static void main(String[] args) {
		System.out.println(reverseVowels("hhelod"));
		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));
	}

	public static String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";
		
		int left  = 0;
		int right = s.length() - 1;
		
		char[] chars = s.toCharArray();
		
		while(left < right) {
			while(left < right && vowels.indexOf(chars[left]) < 0) {
				left++;
			}
			
			while(left < right && vowels.indexOf(chars[right]) < 0) {
				right--;
			}
			
			char c = chars[left];
			chars[left]  = chars[right];
			chars[right] = c;
			
			left++;
			right--;
		}
		
		return String.valueOf(chars);
	}
	
}
