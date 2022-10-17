package com.leetCodeSolution.solutions100to150.solution144;

import java.util.ArrayList;
import java.util.List;

import com.leetCodeSolution.common.TreeNode;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    private static void travel(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        travel(root.left, res);
        travel(root.right, res);
    }
}
