package com.lgalgol.leetcode.test367;

public class Test367 {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(14));
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(1296));
	}

	public static boolean isPerfectSquare(int num) {
		// if(Math.sqrt(num) % 1 == 0) {
		// return true;
		// }
		// return false;

		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}
}
