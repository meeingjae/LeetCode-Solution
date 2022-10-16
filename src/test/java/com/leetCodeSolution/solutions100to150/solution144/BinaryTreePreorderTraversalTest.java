package com.leetCodeSolution.solutions100to150.solution144;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;

public class BinaryTreePreorderTraversalTest {

    @Test
    void example1() {
        //given:
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        null));
        //when:
        List<Integer> res = BinaryTreePreorderTraversal.preorderTraversal(root);
        //then:
        assertThat(res).containsSequence(1, 2, 3);
    }

    @Test
    void example2() {
        //given:
        TreeNode root = null;
        //when:
        List<Integer> res = BinaryTreePreorderTraversal.preorderTraversal(root);
        //then:
        assertThat(res).isEmpty();
    }

    @Test
    void example3() {
        //given:
        TreeNode root = new TreeNode(1);
        //when:
        List<Integer> res = BinaryTreePreorderTraversal.preorderTraversal(root);
        //then:
        assertThat(res).contains(1);
    }
}
