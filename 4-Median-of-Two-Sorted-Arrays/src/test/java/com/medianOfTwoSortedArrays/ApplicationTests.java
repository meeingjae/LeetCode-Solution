package com.medianOfTwoSortedArrays;

import com.medianOfTwoSortedArrays.solution.MedianOfTwoSortedArrays;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    @Description("홀수 테스트")
    void oddTest() {

        //given :
        int[] num1 = new int[5];
        int[] num2 = new int[4];

        num1[0] = 1;
        num1[1] = 3;
        num1[2] = 5;
        num1[3] = 7;
        num1[4] = 9;

        num2[0] = 2;
        num2[1] = 4;
        num2[2] = 6;
        num2[3] = 8;

        //when :
        double result = MedianOfTwoSortedArrays.medianOfTwoSortedArrays(num1, num2);
        // expect - num1 + num2 = [1,2,3,4,5,6,7,8,9]

        //then :
        assert (result == 5.0);
    }

    @Test
    @Description("짝수 테스트")
    void evenTest() {

        //given :
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        num1[0] = 1;
        num1[1] = 3;
        num1[2] = 5;
        num1[3] = 7;
        num1[4] = 9;

        num2[0] = 2;
        num2[1] = 4;
        num2[2] = 6;
        num2[3] = 8;
        num2[4] = 10;

        //when :
        double result = MedianOfTwoSortedArrays.medianOfTwoSortedArrays(num1, num2);
        // expect - num1 + num2 = [1,2,3,4,5,6,7,8,9,10]

        //then :
        assert (result == 5.5);
    }

}
