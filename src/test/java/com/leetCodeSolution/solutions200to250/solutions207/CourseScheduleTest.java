package com.leetCodeSolution.solutions200to250.solutions207;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

    @Test
    void 성공() {
        //given:
        int numCources = 2;
        int[][] prerequisites = { { 1, 0 } };
        //when:
        boolean result = CourseSchedule.cource(numCources, prerequisites);
        //then:
        assertThat(result).isTrue();
    }

    @Test
    void 성공_2() {
        //given:
        int numCources = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        //when:
        boolean result = CourseSchedule.cource(numCources, prerequisites);
        //then:
        assertThat(result).isFalse();
    }
}
