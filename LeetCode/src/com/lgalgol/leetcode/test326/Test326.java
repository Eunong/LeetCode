package com.lgalgol.leetcode.test326;

public class Test326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(81));
	}

	public static boolean isPowerOfThree(int n) {
//		while(n % 3 == 0) {
//			n /= 3;
//			System.out.println("n : " + n);
//		}
//		return n == 1;
		
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
}
