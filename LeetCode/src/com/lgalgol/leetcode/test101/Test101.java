package com.lgalgol.leetcode.test101;

import com.lgalgol.leetcode.test101.Test101;

public class Test101 {

	public static void main(String[] args) {
		
	}

	public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        return checkSymmetric(root.left, root.right);
    }
	
	public static boolean checkSymmetric(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}
		
		if(p == null || q == null || p.val != q.val) {
			return false;
		}
		
		return checkSymmetric(p.left, q.right) && checkSymmetric(p.right, q.left);
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