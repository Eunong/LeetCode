package com.lgalgol.leetcode.test100;

public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		return checkNode(p, q);
	}

	public static boolean checkNode(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null || p.val != q.val) {
			return false;
		}

		return checkNode(p.left, q.left) && checkNode(p.right, q.right);
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
