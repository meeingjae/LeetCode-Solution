package com.leetCodeSolution.solutions.solution1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TwoSumTest {

    @Test
    void twoSumTest() {

        //given:
        int[] nums = new int[5]; // nums = [5,4,8,1,9]
        nums[0] = 5;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 1;
        nums[4] = 9;

        int target = 17;

        int[] resultNums = new int[2];
        resultNums[0] = 4; // 9
        resultNums[1] = 2; // 8

        //when:
        int[] result = TwoSum.twoSum(nums, target);

        //then:
        assert result[0] == resultNums[0];
        assert result[1] == resultNums[1];
    }

    @Test
    void twoSumNegativeValueTest() {

        //given:
        int[] nums = new int[5]; // nums = [5,4,8,1,9]
        nums[0] = -5;
        nums[1] = -4;
        nums[2] = -8;
        nums[3] = -1;
        nums[4] = -9;

        int target = -17;

        int[] resultNums = new int[2];
        resultNums[0] = 4; // 9
        resultNums[1] = 2; // 8

        //when:
        int[] result = TwoSum.twoSum(nums, target);

        //then:
        assert result[0] == resultNums[0];
        assert result[1] == resultNums[1];
    }

}
