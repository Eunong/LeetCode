package com.lgalgol.leetcode.test437;

// 437. Path Sum III
public class Test437 {

	public static void main(String[] args) {

	}

	public int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	private int pathSumFrom(TreeNode node, int sum) {
		if (node == null) {
			return 0;
		}
		return (node.val == sum ? 1 : 0) + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}