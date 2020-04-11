package com.lgalgol.leetcode.test401;

import java.util.ArrayList;
import java.util.List;

// 401. Binary Watch
public class Test401 {

	public static void main(String[] args) {
		System.out.println(readBinaryWatch(1));
	}

	public static List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();

		for (int h = 0; h < 12; h++) { // 0~11
			for (int m = 0; m < 60; m++) { // 0~59
				if (Integer.bitCount(h * 64 + m) == num) { 
					list.add(String.format("%d:%02d", h, m));
				}
			}
		}

		return list;
	}

}
