package com.removeduplicates;

import com.removeduplicates.solution.Solution;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @Test
    void 성공() {
        //given:
        int[] source = new int[4];
        source[0] = 1;
        source[1] = 1;
        source[2] = 2;
        source[3] = 3;
        //when:
        int result = Solution.removeDuplicates(source);
        //then:
        assertThat(result)
                .isEqualTo(3);
    }
}
