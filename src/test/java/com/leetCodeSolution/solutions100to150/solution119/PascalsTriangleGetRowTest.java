package com.leetCodeSolution.solutions100to150.solution119;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PascalsTriangleGetRowTest {

    @Test
    void 성공() {
        //given:
        int rowIndex = 3;
        //when:
        List<Integer> result = PascalsTriangleGetRow.getRow(rowIndex);
        //then:
        assertThat(result)
                .containsSequence(1,3,3,1);
    }
}
