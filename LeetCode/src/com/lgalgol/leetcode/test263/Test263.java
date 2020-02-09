package com.lgalgol.leetcode.test263;

public class Test263 {

	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}

	public static boolean isUgly(int num) {
		if(num < 1) { // 0, 음수 제외
			return false;
		}
		
		while(num > 1) {
			if(num % 5 == 0) {
				num /= 5;
			} else if (num % 3 == 0) {
				num /= 3;
			} else if (num % 2 == 0) {
				num /= 2;
			} else {
				return false;
			}
		}
        return true;
    }
}
