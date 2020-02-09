package com.lgalgol.leetcode.test119;

import java.util.Arrays;
import java.util.List;

public class Test119 {

	public static void main(String[] args) {
		getRow(3);
	}

	public static List<Integer> getRow(int rowIndex) {
		Integer[] pascalsNums = new Integer[rowIndex + 1];
		Arrays.fill(pascalsNums, 0);
		pascalsNums[0] = 1;

		for (int i = 1; i < pascalsNums.length; i++) {
			for (int j = i; j > 0; j--) {
				pascalsNums[j] = pascalsNums[j] + pascalsNums[j - 1];
			}
		}
		return Arrays.asList(pascalsNums);
		
	}

}


