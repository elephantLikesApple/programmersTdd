package org.example.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class p120837Test {
    @Test
    @DisplayName("23 => 5")
    public void t1() {
        assertThat(new org.example.level0.p120837.Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("24 => 6")
    public void t2() {
        assertThat(new org.example.level0.p120837.Solution().solution(24)).isEqualTo(6);

    }

    @Test
    @DisplayName("999 => 201")
    public void t3() {
        assertThat(new org.example.level0.p120837.Solution().solution(999)).isEqualTo(201);
    }

    @Test
    @DisplayName("552 => 112")
    public void t4() {
        assertThat(new org.example.level0.p120837.Solution().solution(552)).isEqualTo(112);
    }
}
