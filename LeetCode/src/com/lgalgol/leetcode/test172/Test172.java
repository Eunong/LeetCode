package com.lgalgol.leetcode.test172;

public class Test172 {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(13));
	}

	public static int trailingZeroes(int n) {
		int cnt = 0;
		int fact    = 1;
		
		int zeroCnt = 0;
		while(n > 1) {
			fact *= n;
			n--;
		}
		System.out.println("factorial : " + fact);
		
//		while(fact%10 == 0) {
//			System.out.println("fact : " + fact);
//			cnt++;
//			
//			fact /= 10;
//		}
//		
		String tmp = String.valueOf(fact);
		for(int i = 0; i < tmp.length(); i++) {
			if(tmp.charAt(i) == '0' ) {
				zeroCnt++;
			}
		}
		return zeroCnt;
	}
}
