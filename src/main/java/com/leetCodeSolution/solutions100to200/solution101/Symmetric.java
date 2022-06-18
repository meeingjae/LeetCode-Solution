package com.leetCodeSolution.solutions100to200.solution101;

import com.leetCodeSolution.common.TreeNode;

public class Symmetric {

    public static boolean isSymmetric(TreeNode root) {

        return isSame(root.left, root.right);
    }

    private static boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null && right != null) {
            return false;
        }

        if (left != null && right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSame(left.left, right.right) &&
               isSame(left.right, right.left);
    }
}
