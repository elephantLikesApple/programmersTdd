package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    @Test
    @DisplayName("7, 1 ==> 1")
    void t1() {
        assertThat(new Solution().solution(7, 1)).isEqualTo(1);
    }
}
