package org.example.level0.p120816;

import org.example.level0.p120816.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class p120816Test {

    @Test
    @DisplayName("7, 1 ==> 1")
    void t1() {
        assertThat(new Solution().solution(7, 1)).isEqualTo(1);
    }
}
