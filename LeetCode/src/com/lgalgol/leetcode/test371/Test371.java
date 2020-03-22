package com.lgalgol.leetcode.test371;

public class Test371 {

	public static void main(String[] args) {
//		System.out.println(getSum(1, 2));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(3));
		System.out.println(getSum(-2, 3));
	}

	public static int getSum(int a, int b) {
		// return Math.abs(a | b);
		
		if (a == 0) {
			return b;
		}
		
		if (b == 0) {
			return a;
		}

		while (b != 0) {
			int carry = a & b;
			System.out.println("carry : " + Integer.toBinaryString(carry));
			a = a ^ b;
			System.out.println("a : " + Integer.toBinaryString(a));
			b = carry << 1;
			System.out.println("b : " + Integer.toBinaryString(b));
		}

		return a;
	}
}
