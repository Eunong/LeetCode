package com.lgalgol.leetcode.test405;

// 405. Convert a Number to Hexadecimal
public class Test405 {

	public static void main(String[] args) {
//		System.out.println(toHex(26));
		System.out.println(toHex(-26));
	}

	public static String toHex(int num) {
		String[] hexNum = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
		String rslt = "";

		if (num == 0) {
			return "0";
		}

		while(num != 0) {
			rslt = hexNum[num&15] + rslt;
			num = (num >>> 4);
		}

		return rslt;
	}
}
