package com.leetCodeSolution.solutions200to250.solutions207;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

    @Test
    void 성공_DFS() {
        //given:
        int numCources = 2;
        int[][] prerequisites = { { 1, 0 } };
        //when:
        boolean result = CourseSchedule.courseDfs(numCources, prerequisites);
        //then:
        assertThat(result).isTrue();
    }

    @Test
    void 성공_DFS_2() {
        //given:
        int numCources = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        //when:
        boolean result = CourseSchedule.courseDfs(numCources, prerequisites);
        //then:
        assertThat(result).isFalse();
    }

    @Test
    void 실패_DFS() {
        //given:
        int numCources = 4;
        int[][] prerequisites = { { 3, 2 }, { 2, 1 }, { 1, 0 }, { 0, 3 }, { 3, 1 }, { 0, 2 } };
        //when:
        boolean result = CourseSchedule.courseDfs(numCources, prerequisites);
        //then:
        assertThat(result).isFalse();
    }

    @Test
    void 성공_BFS() {
        //given:
        int numCources = 2;
        int[][] prerequisites = { { 1, 0 } };
        //when:
        boolean result = CourseSchedule.courseBfs(numCources, prerequisites);
        //then:
        assertThat(result).isTrue();
    }

    @Test
    void 실패_BFS() {
        //given:
        int numCources = 4;
        int[][] prerequisites = { { 3, 2 }, { 2, 1 }, { 1, 0 }, { 0, 3 }, { 3, 1 }, { 0, 2 } };
        //when:
        boolean result = CourseSchedule.courseDfs(numCources, prerequisites);
        //then:
        assertThat(result).isFalse();
    }
}
