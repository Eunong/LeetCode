package com.lgalgol.leetcode.test118;

import java.util.ArrayList;
import java.util.List;

public class Test118 {

	public static void main(String[] args) {
		generate(5);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascalsTriangleList = new ArrayList<>();
		
		for(int i = 0; i < numRows; i++) {
			List<Integer> numsList = new ArrayList<>();
			
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) { // ù��°, �������� �׻� 1
					numsList.add(1);
					continue;
				}
				// �߰��� �� ����Ʈ�� j-1 + j ��
				List<Integer> prevNumsList = pascalsTriangleList.get(i-1);
				numsList.add(prevNumsList.get(j-1) + prevNumsList.get(j));
			}
			
			System.out.println(numsList);
			pascalsTriangleList.add(numsList);
		}
		
		return pascalsTriangleList;
	}

}
