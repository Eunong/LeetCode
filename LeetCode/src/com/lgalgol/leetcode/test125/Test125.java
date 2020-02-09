package com.lgalgol.leetcode.test125;

public class Test125 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
		System.out.println(s);
		System.out.println(new StringBuilder(s).reverse().toString().equals(s));
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	}

}
