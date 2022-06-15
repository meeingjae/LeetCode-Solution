package com.leetCodeSolution.solutions.solution94;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;

public class BinaryTreeInorterTraversalTest {

    @Test
    void 성공() {
        //given:
        TreeNode root = new TreeNode(1,
                                      null,
                                      new TreeNode(2,
                                                   new TreeNode(3, null, null),
                                                   null));
        //when:
        List<Integer> result = BinaryTreeInorterTraversal.inorderTrversal(root);
        //then:
        assertThat(result)
                .containsSequence(List.of(1,3,2));
    }
}
