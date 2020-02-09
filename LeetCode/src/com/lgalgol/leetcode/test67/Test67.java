package com.lgalgol.leetcode.test67;

import java.math.BigInteger;

public class Test67 {

	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}

	public static String addBinary(String a, String b) {
//		int n1 = Integer.valueOf(a, 2);
//		int n2 = Integer.valueOf(b, 2);
//
//		return Integer.toBinaryString(n1 + n2);
		
		BigInteger bn1 = new BigInteger(a, 2);
		BigInteger bn2 = new BigInteger(b, 2);
		
		return bn1.add(bn2).toString(2);
	}
}
