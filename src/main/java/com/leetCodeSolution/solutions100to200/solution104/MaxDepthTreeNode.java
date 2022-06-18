package com.leetCodeSolution.solutions100to200.solution104;

import com.leetCodeSolution.common.TreeNode;

public class MaxDepthTreeNode {

    private static final int ZERO = 0;

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return ZERO;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
