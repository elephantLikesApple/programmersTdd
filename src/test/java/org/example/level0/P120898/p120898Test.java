package org.example.level0.P120898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class p120898Test {
    @Test
    @DisplayName("happy birthday! -> 30")
    public void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }

    @Test
    @DisplayName("I love you~ -> 22")
    public void t2() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }
}
