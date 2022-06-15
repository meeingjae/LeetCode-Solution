package com.leetCodeSolution.solutions.solution94;

import java.util.ArrayList;
import java.util.List;

import com.leetCodeSolution.common.TreeNode;

public class BinaryTreeInorterTraversal {

    public static List<Integer> inorderTrversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private static void helper(TreeNode root, List<Integer> result) {
        if(root != null) {
            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
        }
    }
}
