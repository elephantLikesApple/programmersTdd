package org.example.level0.p120893;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class p120893Test {
    @Test
    @DisplayName("cccCCC -> CCCccc")
    public void t1() {
        assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }

    @Test
    @DisplayName("abCdEfghIJ -> ABcDeFGHij")
    public void t2() {
        assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}