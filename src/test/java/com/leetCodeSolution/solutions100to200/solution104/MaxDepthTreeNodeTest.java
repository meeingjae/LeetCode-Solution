package com.leetCodeSolution.solutions100to200.solution104;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;

public class MaxDepthTreeNodeTest {

    @Test
    void 성공() {
        //given:
        TreeNode root = new TreeNode(
                3, new TreeNode(9,
                                null,
                                null),
                new TreeNode(20,
                             new TreeNode(15, null, null),
                             new TreeNode(7, null, null)));
        //when:
        int result = MaxDepthTreeNode.maxDepth(root);
        //then
        assertThat(result)
                .isEqualTo(3);
    }
}
