package com.leetCodeSolution.solutions200to250.solutions202;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void 성공() {
        HappyNumber happyNumber = new HappyNumber(19);
        boolean expect = true;
        assertThat(happyNumber.isHappyNumber()).isTrue();
    }
}
