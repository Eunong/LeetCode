package com.lgalgol.leetcode.test122;

public class Test122 {

	public static void main(String[] args) {
//		int[] prices = {3, 9, 4, 7, 8, 1}; 6 
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = 0;
        int min = prices[0];
        
        for(int i = 0; i < prices.length ; i++) {
            if(min > prices[i]) {
                min = prices[i];
            } else {
                maxProfit = (prices[i] - min) > maxProfit ? prices[i] - min : maxProfit;
            }
            
        }
        
        System.out.println(maxProfit);
	}

}
