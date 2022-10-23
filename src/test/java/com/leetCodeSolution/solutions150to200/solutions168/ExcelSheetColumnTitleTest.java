package com.leetCodeSolution.solutions150to200.solutions168;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    void example1() {
        //given:
        int columnNumber = 1;
        //when:
        String res = ExcelSheetColumnTitle.convertToTitle(columnNumber);
        //then:
        assertThat(res).isEqualTo("A");
    }

    @Test
    void example2() {
        //given:
        int columnNumber = 28;
        //when:
        String res = ExcelSheetColumnTitle.convertToTitle(columnNumber);
        //then:
        assertThat(res).isEqualTo("AB");
    }

    @Test
    void example3() {
        //given:
        int columnNumber = 701;
        //when:
        String res = ExcelSheetColumnTitle.convertToTitle(columnNumber);
        //then:
        assertThat(res).isEqualTo("ZY");
    }

    @Test
    void charCalcTest() {
        char b = 'A' + 1;
        char z = 'A' + 25;
        assertThat(b).isEqualTo('B');
        assertThat(z).isEqualTo('Z');
    }
}
