
package com.lgalgol.leetcode.test299;

public class Test299 {

	public static void main(String[] args) {
		System.out.println(getHint("1807", "7810"));
		System.out.println(getHint("1123", "0111"));
		System.out.println(getHint("11", "11"));
	}

	public static String getHint(String secret, String guess) {
		int bullCnt = 0;
		int cowsCnt = 0;

		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == secret.charAt(i)) {
				bullCnt++;
				secret = secret.substring(0, i) + secret.substring(i + 1, secret.length());
				guess = guess.substring(0, i) + guess.substring(i + 1, guess.length());
				i--;
			}
		}

		for (int i = 0; i < guess.length(); i++) {
			if(secret.contains(guess.charAt(i)+"")) {				
				for (int j = 0; j < secret.length(); j++) {
					if (guess.charAt(i) == secret.charAt(j)) {
						cowsCnt++;
						secret = secret.substring(0, j) + secret.substring(j + 1, secret.length());
						break;
					}
				}
			}
		}
		return bullCnt + "A" + cowsCnt + "B";
	}
}
