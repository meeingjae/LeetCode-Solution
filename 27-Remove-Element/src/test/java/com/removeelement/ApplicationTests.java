package com.removeelement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @Test
    void 성공() {
        //given:
        int[] intArray = {3,2,3,1};
        int removal = 3;
        RemoveArray removeArray = new RemoveArray(intArray,removal);
        //when:
        int result = removeArray.remove();
        //then:
        assertThat(result)
                .isEqualTo(2);
    }
}
