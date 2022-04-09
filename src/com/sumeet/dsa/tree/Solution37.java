package com.sumeet.dsa.tree;

public class Solution37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(TreeNode A) {

		int heigth = 0;

		if (A == null) {
			return 0;
		}

		return Math.max(solve(A.left), solve(A.right)) + 1;

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
