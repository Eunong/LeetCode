package com.lgalgol.leetcode.test70;

public class Test70 {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {
		if (n == 2)
			return 2;
		else if (n == 1)
			return 1;
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n; i++) { // 0 1 2
			c = a + b; // c = 1, 2, 3
			a = b; // a = 1, 1
			b = c; // b = 1, 2
		}
		return c;
    }
}
