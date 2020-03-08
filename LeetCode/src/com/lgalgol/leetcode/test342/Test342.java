package com.lgalgol.leetcode.test342;

public class Test342 {

	// 342. Power of Four
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(4));
		System.out.println(isPowerOfFour(5));
	}

	public static boolean isPowerOfFour(int num) {
		if (num == 1) {
			return true;
		}

		if (num < 4) {
			return false;
		}

		while (num != 1) {
			if (num % 4 != 0) {
				return false;
			}
			num /= 4;
		}

		return true;
	}
}
