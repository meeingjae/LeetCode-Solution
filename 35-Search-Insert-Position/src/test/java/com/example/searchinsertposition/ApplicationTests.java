package com.example.searchinsertposition;

import com.example.searchinsertposition.solution.IntUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @DisplayName("성공")
    @Test
    void 성공() {
        //given:
        int[] nums = {1,2,3,4,5};
        int target = 4;
        //when:
        IntUtil intUtil = new IntUtil(nums);
        int result = intUtil.searchInsert(target);
        //then:
        assertThat(result).isEqualTo(3);
    }
}
