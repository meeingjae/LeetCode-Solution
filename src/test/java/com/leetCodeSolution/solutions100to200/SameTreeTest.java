package com.leetCodeSolution.solutions100to200;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;
import com.leetCodeSolution.solutions100to200.solution100.SameTree;

public class SameTreeTest {

    @Test
    void 성공() {
        //given:
        TreeNode first = new TreeNode(1, new TreeNode(1), null);
        TreeNode second = new TreeNode(1, null, new TreeNode(1));
        //when:
        boolean result = SameTree.isSameTree(first, second);
        //then:
        assertThat(result)
                .isFalse();
    }
}
