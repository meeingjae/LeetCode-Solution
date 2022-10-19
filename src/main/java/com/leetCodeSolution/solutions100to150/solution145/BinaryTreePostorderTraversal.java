package com.leetCodeSolution.solutions100to150.solution145;

import java.util.ArrayList;
import java.util.List;

import com.leetCodeSolution.common.TreeNode;

public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    private static void travel(TreeNode root, List<Integer> res) {
        if(root != null) {
            travel(root.left, res);
            travel(root.right, res);
            res.add(root.val);
        }
    }
}
