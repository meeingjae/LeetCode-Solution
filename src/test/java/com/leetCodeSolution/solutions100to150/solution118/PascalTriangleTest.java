package com.leetCodeSolution.solutions100to150.solution118;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

    @Test
    void 성공() {
        //given:
        int input = 5;
        //when:
        List<List<Integer>> result = PascalTriangle.generate(input);
        //then:
        assertThat(result)
                .containsSequence(List.of(1),
                                  List.of(1,1),
                                  List.of(1,2,1),
                                  List.of(1,3,3,1),
                                  List.of(1,4,6,4,1));
    }
}
