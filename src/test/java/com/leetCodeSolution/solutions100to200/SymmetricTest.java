package com.leetCodeSolution.solutions100to200;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;
import com.leetCodeSolution.solutions100to200.solution101.Symmetric;

public class SymmetricTest {

    @Test
    void 성공() {
        //given:
        TreeNode root = new TreeNode(
                1, new TreeNode(2,
                                new TreeNode(3, null, null),
                                new TreeNode(4, null, null)),
                new TreeNode(2,
                             new TreeNode(4, null, null),
                             new TreeNode(3, null, null)));
        //when:
        boolean result = Symmetric.isSymmetric(root);
        //then
        assertThat(result)
                .isTrue();
    }
}
