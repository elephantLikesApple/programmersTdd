package org.example.level0.p120851;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class p120851Test {
    @Test
    @DisplayName("aAb1B2cC34oOp => 10")
    public void t1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }

    @Test
    @DisplayName("1a2b3c4d123 => 16")
    public void t2() {
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }
}