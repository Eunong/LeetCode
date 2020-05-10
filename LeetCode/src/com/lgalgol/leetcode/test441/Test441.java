package com.lgalgol.leetcode.test441;

// 441. Arranging Coins
public class Test441 {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(3));
		System.out.println(arrangeCoins(5));
		System.out.println(arrangeCoins(8));
	}

	public static int arrangeCoins(int n) {
		int i = 1;
		
		while(i <= n) {
			n -= i;
			i++;
		}
		
		return i-1;
	}

}
