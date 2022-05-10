package com.leetCodeSolution.solutions.solution9;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromeNumberTest {

    @Test
    void tureCase() {

        //given:
        int source = 123454321;

        //when:
        boolean isPalindromeNumber = PalindromeNumber.palindromeNumber(source);

        //then:
        assert isPalindromeNumber;
    }

    @Test
    void negativeCase() {

        //given:
        int source = -123454321;

        //when:
        boolean isPalindromeNumber = PalindromeNumber.palindromeNumber(source);

        //then:
        assert !isPalindromeNumber;
    }

    @Test
    void nonPalindromeCase() {

        //given:
        int source = 100200;

        //when:
        boolean isPalindromeNumber = PalindromeNumber.palindromeNumber(source);

        //then:
        assert !isPalindromeNumber;
    }
}
