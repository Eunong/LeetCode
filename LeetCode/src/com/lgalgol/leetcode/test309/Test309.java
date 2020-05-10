package com.lgalgol.leetcode.test309;

// 309. Best Time to Buy and Sell Stock with Cooldown
public class Test309 {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 1, 2, 3 }));
		System.out.println(maxProfit(new int[] { 1, 2, 3, 0, 2 }));
	}

	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2) {
			return 0;
		}

		int buy = -prices[0];
		int sell = 0;
		int cooldown = 0;

		for(int i = 1; i < prices.length; i++) {
			int temp = buy;
			buy = Math.max(buy, cooldown - prices[i]);
			cooldown = Math.max(sell, cooldown);
			sell = Math.max(sell, temp + prices[i]);
		}

		return sell > cooldown ? sell : cooldown;
	}

}
