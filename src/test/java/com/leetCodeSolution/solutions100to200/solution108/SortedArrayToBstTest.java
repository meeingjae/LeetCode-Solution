package com.leetCodeSolution.solutions100to200.solution108;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.TreeNode;

public class SortedArrayToBstTest {

    @Test
    void 성공() {
        //given:
        int[] source = {-10,-3,0,5,9};
        //when:
        TreeNode result = SortedArrayToBst.sortedArrayToBST(source);
        TreeNode expected = new TreeNode(0,
                                         new TreeNode(-10,
                                                      null,
                                                      new TreeNode(-3)),
                                         new TreeNode(5,
                                                      null,
                                                      new TreeNode(9)));
        //then:
        assertThat(result)
                .isEqualToComparingFieldByFieldRecursively(expected);
    }
}
