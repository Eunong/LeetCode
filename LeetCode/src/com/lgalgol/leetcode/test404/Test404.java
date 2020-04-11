package com.lgalgol.leetcode.test404;

// 404. Sum of Left Leaves
public class Test404 {

	public static void main(String[] args) {
		TreeNode treeNode    = new TreeNode(3);
		treeNode.left        = new TreeNode(9);
		treeNode.right       = new TreeNode(20);
		treeNode.right.left  = new TreeNode(15);
		treeNode.right.right = new TreeNode(17);
		System.out.println(sumOfLeftLeaves(treeNode));
		
//	    3
//	    / \
//	   9  20
//	     /  \
//	    15   7
	}

	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int rslt = 0;

		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				rslt += root.left.val;
			} else {
				rslt += sumOfLeftLeaves(root.left);
			}
		}

		rslt += sumOfLeftLeaves(root.right);

		return rslt;
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