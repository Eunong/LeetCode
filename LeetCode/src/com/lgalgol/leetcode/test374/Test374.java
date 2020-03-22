package com.lgalgol.leetcode.test374;

public class Test374 {

	public static void main(String[] args) {

	}

	/** 
	 * Forward declaration of guess API.
	 * @param  num   your guess
	 * @return 	     -1 if num is lower than the guess number
	 *			      1 if num is higher than the guess number
	 *               otherwise return 0
	 * int guess(int num);
	 */
//	public static int guessNumber(int n) {
//		if (guess(n) == 0) {
//			return n;
//		}
//
//		int left = 1;
//		int right = n;
//		int mid = 0;
//
//		while (left <= right) {
//			mid = left + (right - left) / 2;
//			// System.out.println("guess(" + mid + ") " + guess(mid));
//			if (guess(mid) > 0) {
//				left = mid + 1;
//			} else if (guess(mid) < 0) {
//				right = mid - 1;
//			} else {
//				return mid;
//			}
//		}
//
//		return mid;
//	}
}
