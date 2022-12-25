package com.leetCodeSolution.solutions200to250.solutions202;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HappyNumberTest {

    private static final int HAPPY_NUM = 19;
    private static final int UN_HAPPY_NUM = 2;

    @Test
    void 성공() {
        assertThat(HappyNumber.isHappyNumber(HAPPY_NUM)).isTrue();
    }

    @Test
    void 성공_isUnHappyNum() {
        assertThat(HappyNumber.isHappyNumber(UN_HAPPY_NUM)).isFalse();
    }
}
