package com.lgalgol.leetcode.test292;

public class Test292 {

	public static void main(String[] args) {
		System.out.println(canWinNim(1));
		System.out.println(canWinNim(4));
		System.out.println(canWinNim(5));
		System.out.println(canWinNim(8));
	}

	public static boolean canWinNim(int n) {
		return n%4 != 0;
	}
}
