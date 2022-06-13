package com.leetCodeSolution.solutions.solution88;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    void 성공() {
        //given:
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        //when:
        MergeSortedArray.merge(nums1,m,nums2,n);
        //then:
        System.out.println(Arrays.toString(nums1));
        assertThat(nums1[5])
                .isEqualTo(6);
    }
}
