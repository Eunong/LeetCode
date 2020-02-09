package com.lgalgol.leetcode.test107;

import java.util.ArrayList;
import java.util.List;

public class Test107 {

	public static void main(String[] args) {
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> rslt = new ArrayList<>();

		createIntegerNodeList(rslt, 0, root);
		
        return rslt;
    }

	public static void createIntegerNodeList(List<List<Integer>> list, int lvl, TreeNode node) {
//		if(node == null) {
//			return;
//		}
//		
//		if(list.size() <= lvl) {
//			list.add(0, new ArrayList<>());
//		}
//        
//        list.get(list.size()-1-lvl).add(node.val);
//		
//		createIntegerNodeList(list, lvl + 1, node.left);
//		createIntegerNodeList(list, lvl + 1, node.right);
	}
}


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}