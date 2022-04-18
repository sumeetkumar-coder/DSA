package com.sumeet.dsa.tree;

public class Solution39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int isSameTree(TreeNode A, TreeNode B) {

        if (A == null && B == null) {
            return 1;
        } else if ((A == null && B != null) || (A != null && B == null)) {
            return 0;
        } else if (A.val != B.val) {
            return 0;
        }

       int x =  isSameTree(A.left, B.left);
        int y = isSameTree(A.right, B.right);

        if (x ==1 && y == 1) {
             return 1;

        }

        return 0;

    }

}
